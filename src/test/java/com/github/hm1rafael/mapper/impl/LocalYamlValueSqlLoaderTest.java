package com.github.hm1rafael.mapper.impl;

import org.junit.Before;
import org.junit.Test;

import com.github.hm1rafael.mapper.ValueSqlLoader;

public class LocalYamlValueSqlLoaderTest {

	private ValueSqlLoader loader;
	
	@Before
	public void setUp() {
		this.loader = new LocalYamlValueSqlLoader();
	}
	
	@Test
	public void loadFile() {
		this.loader.load("src/test/resources/testSql.yaml");
	}
	
}
