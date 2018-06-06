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
		params.setLength(length);
		params.setMessage_sn(message[11]);
		params.setType(message[14]+message[15]);
		switch (message[17]) {
			case 0x06:
				params.setAckType("HEART");
            
			case 0x08:
	            params.setAckType("UPGRADEDEVICE");
	            break;
	        case 0x09:
	            // 远程开/关锁
	        	params.setAckType("LOCK");
	            break;
	        case 0x0a:
	            // 远程启/停
	        	params.setAckType("IGNITE");
	            break;
	        case 0x0c:
	            // 鸣笛
	        	params.setAckType("WHISTLE");
	            break;
	        case 0x0d:
	            // 蓝牙复位
	        	params.setAckType("BLUETOOTHRESET");
	            break;
	        case 0x0e:
	            // 改蓝牙密码
	        	params.setAckType("BLUETOOTHPASS");
	            break;
	        case 0x0f:
	            // 拍照
	        	params.setAckType("PHOTO");
	            break;
	        case 0x10:
	            // 长租
	        	params.setAckType("RENT");
	        case 0x11:
	            // 秘钥
	        	params.setAckType("SECRET");
	            break;
	        default:
	            break;
		}
    	params.setRequest_sn(message[18]);
    	
    	String statusStr = FormatUtils.byteToBinStr(message[19]);
    	
    	//导航屏/仪表亮
    	params.setDash_board(Integer.parseInt(statusStr.substring(0, 1),2));
    	
    	//档位
    	switch (Integer.parseInt(statusStr.substring(1, 4),2)) {
			case 0:
				params.setGear("E/S");
				break;
			case 1:
				params.setGear("R");
				break;
			case 2:
				params.setGear("N");
				break;
			case 3:
				params.setGear("D");
				break;
			case 4:
				params.setGear("P");
				break;
			default:
				params.setGear("null");
				break;
		}
    	
    	//车速
    	params.setSpeed(Integer.parseInt(statusStr.substring(4, 5),2));
    	
    	//行车灯/示宽灯，1为开，0为关
    	params.setRunning_lights(Integer.parseInt(statusStr.substring(5, 6),2));
    	
    	//状态
    	params.setStatus(Integer.parseInt(statusStr.substring(6, 8),2));
    	
		return params;
	}

}
