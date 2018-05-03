package com.zim.terminal.pojo;

/*
 * 解析数据结果
 * */
public class Analysis<T> {

	/*
	 * 解析后数据的类型
	 * */
	private String type;
	
	/*
	 * 根据类型转换成对应的数据对象
	 * */
	private T data;

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
