package com.zim.terminal.saika.ack;

import java.util.HashMap;
import java.util.Map;

import com.zim.terminal.utils.FormatUtils;

public class Ack0001 {
	protected String data;
	protected byte[] message;
	public Ack0001() {
		
	}
	public Ack0001(String string) {
		this.data = string;
		if(string.length()>28)
			this.message = FormatUtils.strToByte(string);
	}
	
	//设备ID 命令字 接收命令 流水 执行结果
	public Map<String, Object> analysis() {
		if (message == null || data==null)
            return null;
		int length = Integer.parseInt(data.substring(24,28),16);
		if(FormatUtils.vaildata(message,length) != true)
			return null;
		Map<String, Object> params = new HashMap<>();
		String terminalId = data.substring(2, 22);
		params.put("terminal_id", terminalId);
		params.put("message_sn", message[11]);
		params.put("lenght", length);
		switch (message[17]) {
			case 0x03:
	            //拍照
	            break;
	        case 0x09:
	            // 远程开/关锁
	        	params.put("type","lock");
	            break;
	        case 0x0a:
	            // 远程启/停
	            params.put("type", "ingite");
	            break;
	        case 0x0c:
	            // 鸣笛
	            params.put("type", "whistle");
	            break;
	        case 0x0e:
	            // 改蓝牙密码
	            params.put("type", "bluetooth");
	            break;
	        default:
	            break;
		}
    	params.put("request_sn", message[18]);
    	params.put("status", message[19]== 0x00 ? "success" : "fail");
		return params;
	}
	
	public String getJson() {
		
		
		return null;
	}
	protected void name() {
		
	}
	
	public static void main(String[] args) {
		Ack0001 ask = new Ack0001("AA0000000B121171118001B60029000417111820335300001E091133011120230927607500000F000000000B000000000000000002291A04AA");
		System.out.println(ask.analysis());
		
	}
}
