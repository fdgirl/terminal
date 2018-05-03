package com.zim.terminal.pojo;



/**
 * 图片数据
 */
public class Photo {
	
	private String equipment_id;
	
	private int message_sn;
	
	private String type;
	
	private int length;
	
	private String photoType;	//图片格式 0x00：JPEG  0x01：GIF 其他保留
	private int size;//总包数 
	private String bis;	//数据
	private long time;
	private double lng;
	private double lat;
	
}
