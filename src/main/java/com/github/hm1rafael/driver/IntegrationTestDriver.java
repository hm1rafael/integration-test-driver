package com.github.hm1rafael.driver;

import com.github.hm1rafael.connection.IntegrationTestConnection;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        URL resource = getSqlFile(url);
        Exception exception;
        try {
            File file = new File(resource.toURI());
            return new IntegrationTestConnection(file);
        } catch (URISyntaxException e) {
            exception = e;
        }
        throw new IllegalStateException("Failed to load path", exception);
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return getSqlFile(url) != null;
    }

    private URL getSqlFile(String url) {
        return getClass().getClassLoader().getResource(url);
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

}
