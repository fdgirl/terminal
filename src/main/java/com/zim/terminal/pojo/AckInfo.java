package com.zim.terminal.pojo;

/*
 * ACK data
 * */
public class AckInfo {
	private String equipment_id;
	
	private int message_sn;
	
	private int length;
	
	private int type;
	
	private int request_sn;
	
	private boolean status;
	
	private String ackType;
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

	/**
	 * @return length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length 要设置的 length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return ackType
	 */
	public String getAckType() {
		return ackType;
	}

	/**
	 * @param ackType 要设置的 ackType
	 */
	public void setAckType(String ackType) {
		this.ackType = ackType;
	}

	/**
	 * @return type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type 要设置的 type
	 */
	public void setType(int type) {
		this.type = type;
	}
	
}
