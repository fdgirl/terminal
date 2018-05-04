package com.zim.terminal.saika.ack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zim.terminal.pojo.Photo;
import com.zim.terminal.utils.FormatUtils;

public class Image0003 {
	protected String data;
	protected byte[] message;
	public Image0003(byte[] bytes) {
		this.message = bytes;
		if(bytes.length>14)
			this.data = FormatUtils.byteToHexStr(bytes);
	}
	
	public Photo analysis() {
		if (message == null || data==null)
            return null;
		int length = Integer.parseInt(data.substring(24,28),16);
		/*if(FormatUtils.vaildata(message,length) != true)
			return null;*/
		Photo params = new Photo();
		
		String terminalId = data.substring(2, 22);
		params.setEquipment_id(terminalId);
		params.setLength(length);
		params.setMessage_sn(message[11]);
		params.setType(message[14]+message[15]);
		switch (message[16]) {
		case 0x00:
			params.setPhotoType("JPEG");
			break;
		case 0x01:
			params.setPhotoType("GIF");
			break;
		default:
			break;
		}
		if((byte) message[17] != 0) {			
			params.setSize(message[17]);
		}
		params.setNumber(message[18]);
		
		int len = length-20;
		
		params.setBis(data.substring(38,38+len*2));
		
		StringBuilder timeStr = new StringBuilder();
		timeStr.append("20");
		timeStr.append(data.substring(38+len*2,50+len*2));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		long time = 0;
		try {
			Date date= sdf.parse(timeStr.toString());
			time = date.getTime();
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(time< 1511008433000L) {
			time = System.currentTimeMillis();
		}
		params.setTime(time);
		
		double longitude = Double.parseDouble(data.substring(50+len*2, 53+len*2)) + Double.parseDouble("0." + data.substring(53+len*2, 60+len*2)) / 60 * 100;
		double latitude = Double.parseDouble(data.substring(60+len*2, 62+len*2)) + Double.parseDouble("0." + data.substring(62+len*2, 68+len*2)) / 60 * 100;
		
		params.setLng(longitude);
		params.setLat(latitude);
		
		return params;
	}
	
}
