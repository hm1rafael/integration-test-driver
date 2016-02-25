package com.github.hm1rafael.statement;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public abstract class IntegrationTestPreparedStatementDoesNothingOperations implements CallableStatement, PreparedStatement {

	@Override
	public int getMaxFieldSize() throws SQLException {
		return 0;
	}

	@Override
	public void setMaxFieldSize(int max) throws SQLException {
	}

	@Override
	public int getMaxRows() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxRows(int max) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEscapeProcessing(boolean enable) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getQueryTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setQueryTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCursorName(String name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getMoreResults() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFetchDirection(int direction) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFetchDirection() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFetchSize(int rows) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFetchSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResultSetConcurrency() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResultSetType() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addBatch(String sql) throws SQLException {
		// TODO Auto-generated method stub
	}

	@Override
	public void clearBatch() throws SQLException {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void setBlob(String parameterName, Blob x) throws SQLException {
		
		
	}

	@Override
	public void setClob(String parameterName, Clob x) throws SQLException {
		
		
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {
		
		
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {
		
		
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {
		
		
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
		
		
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
		
		
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
		
		
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value) throws SQLException {
		
		
	}

	@Override
	public void setClob(String parameterName, Reader reader) throws SQLException {
		
		
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
		
		
	}

	@Override
	public void setNClob(String parameterName, Reader reader) throws SQLException {
	}


	@Override
	public void setRowId(String parameterName, RowId x) throws SQLException {
		
		
	}

	@Override
	public void setNString(String parameterName, String value) throws SQLException {
		
		
	}

	@Override
	public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {
		
		
	}

	@Override
	public void setNClob(String parameterName, NClob value) throws SQLException {
		
		
	}

	@Override
	public void setClob(String parameterName, Reader reader, long length) throws SQLException {
		
		
	}

	@Override
	public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {
		
		
	}

	@Override
	public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
		
		
	}

	
	@Override
	public void setURL(String parameterName, URL val) throws SQLException {
		
		
	}

	@Override
	public void setNull(String parameterName, int sqlType) throws SQLException {
		
		
	}

	@Override
	public void setBoolean(String parameterName, boolean x) throws SQLException {
		
		
	}

	@Override
	public void setByte(String parameterName, byte x) throws SQLException {
		
		
	}

	@Override
	public void setShort(String parameterName, short x) throws SQLException {
		
		
	}

	@Override
	public void setInt(String parameterName, int x) throws SQLException {
		
		
	}

	@Override
	public void setLong(String parameterName, long x) throws SQLException {
		
		
	}

	@Override
	public void setFloat(String parameterName, float x) throws SQLException {
		
		
	}

	@Override
	public void setDouble(String parameterName, double x) throws SQLException {
		
		
	}

	@Override
	public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
		
		
	}

	@Override
	public void setString(String parameterName, String x) throws SQLException {
		
		
	}

	@Override
	public void setBytes(String parameterName, byte[] x) throws SQLException {
		
		
	}

	@Override
	public void setDate(String parameterName, Date x) throws SQLException {
	}

	@Override
	public void setTime(String parameterName, Time x) throws SQLException {
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
	}

	@Override
	public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
	}

	@Override
	public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
	}

	@Override
	public void setObject(String parameterName, Object x) throws SQLException {
	}

	@Override
	public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
	}

	@Override
	public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
	}

	@Override
	public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
	}

	@Override
	public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
	}

	@Override
	public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
	}
	
	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		
		
	}

	@Override
	public void setNString(int parameterIndex, String value) throws SQLException {
		
		
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
		
		
	}

	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		
		
	}

	@Override
	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
		
		
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
		
		
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
		
		
	}

	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
		
		
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
		
		
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
		
		
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
		
		
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
		
		
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
		
		
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
		
		
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
		
		
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
		
		
	}

	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		
		
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
		
		
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		
		
	}
	
	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		
		
	}

	@Override
	public void setRef(int parameterIndex, Ref x) throws SQLException {
		
		
	}

	@Override
	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		
		
	}

	@Override
	public void setClob(int parameterIndex, Clob x) throws SQLException {
		
		
	}

	@Override
	public void setArray(int parameterIndex, Array x) throws SQLException {
		
		
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		
		return null;
	}

	@Override
	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		
		
	}

	@Override
	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		
		
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		
		
	}

	@Override
	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
		
		
	}

	@Override
	public void setURL(int parameterIndex, URL x) throws SQLException {
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		
		
	}

	@Override
	public void setObject(int parameterIndex, Object x) throws SQLException {
	}

	@Override
	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		
		
	}

	@Override
	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		
		
	}

	@Override
	public void setByte(int parameterIndex, byte x) throws SQLException {
		
		
	}

	@Override
	public void setShort(int parameterIndex, short x) throws SQLException {
		
		
	}

	@Override
	public void setInt(int parameterIndex, int x) throws SQLException {
		
		
	}

	@Override
	public void setLong(int parameterIndex, long x) throws SQLException {
		
		
	}

	@Override
	public void setFloat(int parameterIndex, float x) throws SQLException {
		
		
	}

	@Override
	public void setDouble(int parameterIndex, double x) throws SQLException {
		
		
	}

	@Override
	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		
		
	}

	@Override
	public void setString(int parameterIndex, String x) throws SQLException {
		
		
	}

	@Override
	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		
		
	}

	@Override
	public void setDate(int parameterIndex, Date x) throws SQLException {
		
		
	}

	@Override
	public void setTime(int parameterIndex, Time x) throws SQLException {
		
		
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		
		
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		
		
	}

	@Override
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		return 0;
	}

	@Override
	public boolean isClosed() throws SQLException {
		
		return false;
	}

	@Override
	public void setPoolable(boolean poolable) throws SQLException {
		
		
	}

	@Override
	public boolean isPoolable() throws SQLException {
		return false;
	}

	@Override
	public void closeOnCompletion() throws SQLException {
	}

	@Override
	public boolean isCloseOnCompletion() throws SQLException {
		return false;
	}
	
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		
		return false;
	}
	
	@Override
	public boolean getMoreResults(int current) throws SQLException {
		return false;
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return null;
	}
	
	@Override
	public int getUpdateCount() throws SQLException {
		return 0;
	}

	@Override
	public void close() throws SQLException {
	}
	
	@Override
	public void clearParameters() throws SQLException {
	}

	@Override
	public void addBatch() throws SQLException {
		
		
	}

	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		return null;
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {
	}

	@Override
	public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {
		
	}

	@Override
	public boolean wasNull() throws SQLException {
		
		return false;
	}

	@Override
	public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
		
	}
	
	@Override
	public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
		
		
	}

	@Override
	public SQLXML getSQLXML(int parameterIndex) throws SQLException {
		
		return null;
	}

	
}
