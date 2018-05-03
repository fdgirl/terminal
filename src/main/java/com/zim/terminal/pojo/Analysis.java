package com.zim.terminal.pojo;

/*
 * 解析数据结果
 * */
public class Analysis<T> {
	private String terminal_id;
	
	private String type;
	
	private T data;

	public String getTerminal_id() {
		return terminal_id;
	}

	public void setTerminal_id(String terminal_id) {
		this.terminal_id = terminal_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
