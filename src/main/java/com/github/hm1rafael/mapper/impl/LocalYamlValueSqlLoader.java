package com.github.hm1rafael.mapper.impl;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.github.hm1rafael.mapper.ValueSqlLoader;

public class LocalYamlValueSqlLoader implements ValueSqlLoader {

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
			throw new IllegalStateException("Fail to load data", e);
		}
	}

	@Override
	public SqlResultsHolder load(String path) {
		File file = new File(path);
		Map loadFiles = loadFiles(file, new HashMap<>());
		Set entrySet = loadFiles.entrySet();
		for (Object object : entrySet) {
			Map.Entry entry = (Map.Entry) object;
			List<Map<String,String>> mappings = (List<Map<String,String>>) entry.getValue();
			for (Map<String,String> mapping : mappings) {
				Set<String> parametersSet = mapping.keySet();
			}
		}
		return null;
	}

	@Override
	public String getProtocolo() {
		return null;
	}

}
