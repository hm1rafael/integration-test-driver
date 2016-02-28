package com.github.hm1rafael.mapper.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SqlResultsHolder {

	private Map<SqlParameterKey, Results> resultsMap = new LinkedHashMap<>();
	
	public void add(String sql, List<ParametersResultsMapper> parametersResults) {
		for (ParametersResultsMapper parametersResultsMapper : parametersResults) {
			SqlParameterKey sqlParameterKey = new SqlParameterKey();
			sqlParameterKey.sql = sql;
			sqlParameterKey.parameters = parametersResultsMapper.getParameters();
			this.resultsMap.put(sqlParameterKey, parametersResultsMapper.getResults());
		}
	}
	
	public Results get(String sql, List<Parameter> parameters) {
		SqlParameterKey sqlParameterKey = new SqlParameterKey();
		sqlParameterKey.sql = sql;
		sqlParameterKey.parameters = parameters;
		return this.resultsMap.get(sqlParameterKey);
	}
	
}

class SqlParameterKey {
	
	protected String sql;
	protected List<Parameter> parameters;
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SqlParameterKey) {
			SqlParameterKey sqlParameterKey = (SqlParameterKey) obj;
			boolean sameSql = this.sql.equals(sqlParameterKey.sql);
			if (!sameSql) {
				return false;
			}
			if (sameSql && (this.parameters == null || this.parameters.isEmpty())) {
				return true;
			}
			return this.parameters.equals(sqlParameterKey.parameters);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}

class Parameter {
	 
	protected String name;
	protected Object value;
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Parameter) {
			Parameter parameter = (Parameter) obj;
			return this.name != null && this.name.equals(parameter.name) && this.value != null && this.value.equals(parameter.value); 
		}
		return false;
	}
	
}


