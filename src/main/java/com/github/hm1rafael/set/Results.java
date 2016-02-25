package com.github.hm1rafael.set;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Results {

	private LinkedList<Row> rows = new LinkedList<>(); 
	
	private Row actualRow;
	
	public LinkedList<Row> getRows() {
		return this.rows;
	}
	
	public void addRow() {
		this.actualRow = new Row();
		this.rows.add(this.actualRow);
	}
	
	public void addResult(String columnName, Object value) {
		Column column = new Column();
		column.setValue(value);
		this.actualRow.addColumn(columnName, column);
	}
	
}

class Row {
	
	private Map<String, Column> columnsByName = new ConcurrentHashMap<>();
	private Map<Integer, Column> columnsByIndex = new ConcurrentHashMap<>();
	
	public Collection<Column> getColumns() {
		return this.columnsByName.values();
	}

	public void addColumn(String columnName, Column column) {
		this.columnsByName.put(columnName, column);
		this.columnsByIndex.put(this.columnsByName.size(), column);
	}
	
}

class Column {
	
	private Object value;

	public Object getValue() {
		return this.value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
}
