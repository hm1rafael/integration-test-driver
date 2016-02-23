package com.hm1rafael.driver;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.hm1rafael.connection.IntegrationTestConnection;

public class IntegrationTestDriver implements Driver {

	private static Logger logger = Logger.getLogger(IntegrationTestDriver.class.getName());
	
	static {
		IntegrationTestDriver driver = new IntegrationTestDriver();
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			logger.log(Level.WARNING, "Wasn't possible to register the integration test driver.", e);
		}
	}
	
	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		File resultsFile = getResultsFile(url);
		return new IntegrationTestConnection(resultsFile);
	}

	private File getResultsFile(String url) {
		return new File(url); //TODO: get the name of the file from url
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		return true; //TODO check url
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		return new DriverPropertyInfo[0]; //No driver property info
	}

	@Override
	public int getMajorVersion() {
		return 1;
	}

	@Override
	public int getMinorVersion() {
		return 0;
	}

	@Override
	/**
	 * This method returns false because the javadoc for jdbcCompliant()
	 */
	public boolean jdbcCompliant() {
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return logger;
	}

}
