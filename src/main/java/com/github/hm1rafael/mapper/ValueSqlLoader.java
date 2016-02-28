package com.github.hm1rafael.mapper;

import com.github.hm1rafael.mapper.impl.SqlResultsHolder;

public interface ValueSqlLoader {

	SqlResultsHolder load(String url);
	
	String getProtocolo();
	
}
