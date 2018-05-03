package com.zim.terminal.pojo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * 上传的照片
 */
public class Photo implements Serializable {
	/**  
	 * @Fields serialVersionUID : TODO:
	 */
	private static final long serialVersionUID = 8410457372576035471L;
	
	private byte photoType;	//图片格式 0x00：JPEG  0x01：GIF 其他保留
	private int size;//总包数 
	private byte[][]bis;	//数据
	private Date firstDataTime; 	//第一条数据时间
	private Calendar LastTime;	//最后一条的服务器接收时间
	private double lng;
	private double lat;
	/**
	 * TODO:图片格式 0x00：JPEG  0x01：GIF 其他保留
	 * @return: the photoType
	 */
	public byte getPhotoType() {
		return photoType;
	}
	/**
	 * TODO:图片格式 0x00：JPEG  0x01：GIF 其他保留
	 * @param photoType the photoType to set
	 */
	public void setPhotoType(byte photoType) {
		this.photoType = photoType;
	}
	/**
	 * TODO:总包数
	 * @return: the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * TODO:总包数
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size =size;
	}
	/**
	 * TODO:数据
	 * @return: the biList
	 */
	public byte[][] getBis() {
		return bis;
	}
	/**
	 * TODO:数据
	 * @param biList the biList to set
	 */
	public void setBiList(byte[][] bis) {
		this.bis = bis;
	}
	/**
	 * 第一条数据时间
	 */
	public Date getFirstDataTime() {
		return firstDataTime;
	}
	/**
	 * 第一条数据时间
	 */
	public void setFirstDataTime(Date firstDataTime) {
		this.firstDataTime = firstDataTime;
	}
	/**
	 * 最后一条的服务器接收事件
	 */
	public Calendar getLastTime() {
		return LastTime;
	}
	/**
	 * 最后一条的服务器接收事件
	 */
	public void setLastTime(Calendar lastTime) {
		LastTime = lastTime;
	}
	/**
	 * @see #lng
	 * @return: the lng
	 */
	public double getLng() {
		return lng;
	}
	/**
	 * @see #lng
	 * @param lng the lng to set
	 */
	public void setLng(double lng) {
		this.lng = lng;
	}
	/**
	 * @see #lat
	 * @return: the lat
	 */
	public double getLat() {
		return lat;
	}
	/**
	 * @see #lat
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
}
