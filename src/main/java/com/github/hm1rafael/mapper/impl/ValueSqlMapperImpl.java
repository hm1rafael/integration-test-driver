package com.github.hm1rafael.mapper.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.yaml.snakeyaml.Yaml;

import com.github.hm1rafael.logger.Logger;
import com.github.hm1rafael.mapper.ValueSqlMapper;

public class ValueSqlMapperImpl implements ValueSqlMapper {

	private Yaml mapper = new Yaml();
	
	@Override
	public void add(File[] files) {
		for (File file2 : files) {
			
		}
	}

	@Override
	public void add(File file) {
		this.mapper = load(file);
	}

	private Yaml load(File file) {
		InputStream s = null;	
		try {
			Yaml y = new Yaml();
			s = new FileInputStream(file);
			y.load(s);
			return y;
		} catch (FileNotFoundException e) {
			Logger.getLogger().log(Level.INFO, "File not found: " + file.getAbsolutePath(), e);
		} finally {
			try {
				s.close();
			} catch (IOException e) {
			}
		}
		return null;
	}

}
