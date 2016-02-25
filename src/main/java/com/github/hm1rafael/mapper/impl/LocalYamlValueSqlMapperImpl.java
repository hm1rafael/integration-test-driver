package com.github.hm1rafael.mapper.impl;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.github.hm1rafael.mapper.ValueSqlMapper;

public class LocalYamlValueSqlMapperImpl implements ValueSqlMapper {

	private Map loadFiles(File file, Map mapper) {
		if (!file.isDirectory()) {
			mapper.putAll(loadFile(file));
		} else {
			File[] nestedFiles = file.listFiles();
			for (File nestedFile : nestedFiles) {
				loadFiles(nestedFile, mapper);
			}
		}
		return mapper;
	}

	private Map loadFile(File file) {
		try (FileReader reader = new FileReader(file)) {
			YamlReader y = new YamlReader(reader);
			return (Map) y.read();
		} catch (Exception e) {
			throw new IllegalStateException("Fail to load data");
		}
	}

	@Override
	public Map load(String path) {
		File file = new File(path);
		return loadFiles(file, new HashMap<>());
	}

}
