package com.github.hm1rafael.driver;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.github.hm1rafael.connection.IntegrationTestConnection;
import com.github.hm1rafael.mapper.ValueSqlLoader;
import com.github.hm1rafael.mapper.impl.LocalYamlValueSqlLoader;
import com.github.hm1rafael.mapper.impl.LocalYamlValueSqlLoaderTest;

public class IntegrationTestDriver implements Driver {

	private static Logger logger = Logger.getLogger(IntegrationTestDriver.class.getName());

	private Map map;
	
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
		if (this.map == null) {
			UrlInformation urlInformation = extractInformationFromUrl(url);
			ValueSqlLoader valueSqlMapper = findImplementationBasedOnTheProtocol(urlInformation.protocol);
			valueSqlMapper.load(urlInformation.urlPath);
		}
		return new IntegrationTestConnection(this.map);
	}

	private ValueSqlLoader findImplementationBasedOnTheProtocol(String protocol) {
		return new LocalYamlValueSqlLoader();
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
		return com.github.hm1rafael.logger.Logger.getLogger();
	}
	
	private UrlInformation extractInformationFromUrl(String url) {
		UrlInformation urlInformation = new UrlInformation();
		urlInformation.protocol = "yaml";
		urlInformation.urlPath = "test";
		return urlInformation;
	}
	
	private class UrlInformation {
		
		public UrlInformation() {

		}
		
		private String protocol;
		private String urlPath;
		
	}
	

}
