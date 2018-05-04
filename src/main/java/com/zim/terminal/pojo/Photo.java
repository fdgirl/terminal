package com.zim.terminal.pojo;



/**
 * 图片数据
 */
public class Photo {
	
	private String equipment_id;
	
	private int message_sn;
	
	private int type;
	
	private int length;
	
	private String photoType;	//图片格式 0x00：JPEG  0x01：GIF 其他保留
	private int size;//总包数 
	private int number;
	private String bis;	//数据
	private long time;
	private double lng;
	private double lat;
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
	/**
	 * @return photoType
	 */
	public String getPhotoType() {
		return photoType;
	}
	/**
	 * @param photoType 要设置的 photoType
	 */
	public void setPhotoType(String photoType) {
		this.photoType = photoType;
	}
	/**
	 * @return size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size 要设置的 size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number 要设置的 number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @param time 要设置的 time
	 */
	public void setTime(long time) {
		this.time = time;
	}
	/**
	 * @return lng
	 */
	public double getLng() {
		return lng;
	}
	/**
	 * @param lng 要设置的 lng
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}
	/**
	 * @return lat
	 */
	public double getLat() {
		return lat;
	}
	/**
	 * @param lat 要设置的 lat
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	/**
	 * @return bis
	 */
	public String getBis() {
		return bis;
	}
	/**
	 * @param bis 要设置的 bis
	 */
	public void setBis(String bis) {
		this.bis = bis;
	}
	
}
