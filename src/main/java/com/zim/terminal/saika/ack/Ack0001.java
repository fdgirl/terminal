package com.zim.terminal.saika.ack;

import com.zim.terminal.pojo.AckInfo;
import com.zim.terminal.utils.FormatUtils;

public class Ack0001 {
	protected String data;
	protected byte[] message;
	public Ack0001() {
		
	}
	public Ack0001(byte[] bytes) {
		this.message = bytes;
		if(bytes.length>14)
			this.data = FormatUtils.byteToHexStr(bytes);
	}
	
	//设备ID 命令字 接收命令 流水 执行结果
	public AckInfo analysis() {
		if (message == null || data==null)
            return null;
		int length = Integer.parseInt(data.substring(24,28),16);
		if(FormatUtils.vaildata(message,length) != true)
			return null;
		AckInfo params = new AckInfo();
		String terminalId = data.substring(2, 22);
		params.setEquipment_id(terminalId);
		params.setLenght(length);
		params.setMessage_sn(message[11]);
		switch (message[17]) {
			case 0x08:
	            params.setType("UPGRADEDEVICE");
	            break;
	        case 0x09:
	            // 远程开/关锁
	        	params.setType("LOCK");
	            break;
	        case 0x0a:
	            // 远程启/停
	        	params.setType("IGNITE");
	            break;
	        case 0x0c:
	            // 鸣笛
	        	params.setType("WHISTLE");
	            break;
	        case 0x0d:
	            // 蓝牙复位
	        	params.setType("BLUETOOTHRESET");
	            break;
	        case 0x0e:
	            // 改蓝牙密码
	        	params.setType("BLUETOOTHPASS");
	            break;
	        case 0x0f:
	            // 拍照
	        	params.setType("PHOTO");
	            break;
	        case 0x10:
	            // 长租
	        	params.setType("RENT");
	            break;
	        default:
	            break;
		}
    	params.setRequest_sn(message[18]);
    	params.setStatus(message[19]== 0x00 ? true: false);
		return params;
	}

}
