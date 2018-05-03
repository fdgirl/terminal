package com.zim.terminal.pojo;

/*
 * ACK data
 * */
public class AckInfo {
	private String equipment_id;
	
	private int message_sn;
	
	private int length;
	
	private String type;
	
	private int request_sn;
	
	private boolean status;

	/**
	 * @return equipment_id
	 */
	public String getEquipment_id() {
		return equipment_id;
	}

	/**
	 * @param equipment_id 要设置的 equipment_id
	 */
	public void setEquipment_id(String equipment_id) {
		this.equipment_id = equipment_id;
	}

	/**
	 * @return message_sn
	 */
	public int getMessage_sn() {
		return message_sn;
	}

	/**
	 * @param message_sn 要设置的 message_sn
	 */
	public void setMessage_sn(int message_sn) {
		this.message_sn = message_sn;
	}

	/**
	 * @return length
	 */
	public int getLenght() {
		return length;
	}

	/**
	 * @param lenght 要设置的 length
	 */
	public void setLenght(int length) {
		this.length = length;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type 要设置的 type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return request_sn
	 */
	public int getRequest_sn() {
		return request_sn;
	}

	/**
	 * @param request_sn 要设置的 request_sn
	 */
	public void setRequest_sn(int request_sn) {
		this.request_sn = request_sn;
	}

	/**
	 * @return status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status 要设置的 status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
