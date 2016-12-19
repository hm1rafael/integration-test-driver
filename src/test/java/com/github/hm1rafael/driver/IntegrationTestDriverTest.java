/**
 * MIT License
 * <p>
 * Copyright (c) [year] [fullname]
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.hm1rafael.driver;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by mattos on 19/12/16.
 */
public class IntegrationTestDriverTest {

    @Test
    public void createDatasourceFromValidResources() throws SQLException {
        Connection connection = getConnectionFromDatasource("fileSql.txt");
        Assert.assertNotNull(connection);
        Connection connection2 = getConnectionFromDatasource("test/fileSql.txt");
        Assert.assertNotNull(connection2);
        Connection connection3 = getConnectionFromDatasource("test/");
        Assert.assertNotNull(connection3);
    }

    @Test(expected = SQLException.class)
    public void createDatasourceFromFileThatDoesNotExists() throws SQLException {
        getConnectionFromDatasource("fileSqlNotExists.txt");
    }

    @Test(expected = SQLException.class)
    public void createDatasourceFromDirectoryThatDoesNotExists() throws SQLException {
        getConnectionFromDatasource("testNotFound/");
    }

    private Connection getConnectionFromDatasource(String file) throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(file);
        ds.setDriverClassName(IntegrationTestDriver.class.getName());
        return ds.getConnection();
    }


}



