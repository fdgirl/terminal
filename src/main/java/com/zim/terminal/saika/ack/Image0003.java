package com.zim.terminal.saika.ack;

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
		if(FormatUtils.vaildata(message,length) != true)
			return null;
		Photo params = new Photo();
		
		
		return null;
	}
	
}
