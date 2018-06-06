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
	
	private int status;
	
	private String ackType;
	
	/**
     * 导航屏/仪表亮 1为开，0为关
     */
    private int dash_board;
	 
	/**
     * 行车灯/示宽灯，1为开，0为关
     */
    private int running_lights;
    
    /**
     * 速度 KM/H
     */
    private int speed;
    
    /**
     * 档位  节能档E; 倒档R; 空档N; 自动D档; 停车P档
     */
    private String gear;
    
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRunning_lights() {
		return running_lights;
	}

	public void setRunning_lights(int running_lights) {
		this.running_lights = running_lights;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

    public int getDash_board() {
        return dash_board;
    }

    public void setDash_board(int dash_board) {
        this.dash_board = dash_board;
    }
	
}
