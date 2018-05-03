package com.zim.terminal;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.zim.terminal.pojo.Analysis;
import com.zim.terminal.pojo.Photo;
import com.zim.terminal.pojo.GpsInfo;
import com.zim.terminal.saika.ack.Ack0001;
import com.zim.terminal.saika.ack.Ack8XXX;
import com.zim.terminal.saika.ack.Gps0004;
import com.zim.terminal.utils.FormatUtils;

public class SaiKa implements Terminal {
	private final static Base64.Decoder decoder = Base64.getDecoder();
	public Analysis<Object> anlysis(byte[] bytes) {
		//创建返回对象
		Analysis<Object> returnResult = new Analysis<Object>();
		
		//判断数据类型并分配对象
		switch (bytes[15]) {
		case 0x01:
			returnResult.setType("ACK");
			returnResult.setData(new Ack0001(bytes).analysis());
			break;
		case 0x03:
			returnResult.setType("PHOTO");
			break;
		case 0x04:
			returnResult.setType("GPS");
			returnResult.setData(new Gps0004(bytes).analysis());
			break;
		default:
			break;
		}
		
		return returnResult;
	}
	
	public String sreverAck(String string, boolean bool) {
		return Ack8XXX.ack8001(string, bool);
	}
	
	public String heartBeat(String terminal) {
		return Ack8XXX.ack8006(terminal);
	}
	
	public String update(String terminal, String version) {
		StringBuilder address = new StringBuilder("ftp:120.79.31.177,21,cheji,cheji,openatE");
		address.append(version.replaceAll("\\.", "").replaceAll("V", "").replaceAll("v", ""));
		address.append(".dll");
		System.out.println(address);
		return Ack8XXX.ack8008(terminal,address.toString());
	}
	
	public String lock(String terminal,boolean bool) {
		return Ack8XXX.ack8009(terminal,bool);
	}
	
	public String ignite(String terminal,boolean bool) {
		return Ack8XXX.ack800A(terminal,bool);
	}
	
	public String whistle(String terminal, boolean bool) {
		return Ack8XXX.ack800C(terminal,bool);
	}

	public String initBluetooth(String terminal) {
		return Ack8XXX.ack800D(terminal);
	}

	public String password(String terminal, String password) {
		return Ack8XXX.ack800E(terminal,password);
	}
	
	public String photo(String terminal) {
		return Ack8XXX.ack800F(terminal);
	}
	
	public String rent(String terminal,int type) {
		return Ack8XXX.ack8010(terminal, type);
	}
	public static void main(String[] args) {
		/*Terminal terminal = new SaiKa();
		String base= "qgAAAAsSEAAAAAF8ACkABBgFAhVVIwAFHg0RQmARIDgBAYGXAAANAAAAAAwAAAAAAAAAAAEUDgWq";
    	byte[] analysis = null;
		analysis = decoder.decode(base);
		Analysis<Object> res = terminal.anlysis(analysis);
		System.out.println(res.getType());
		GpsInfo data = (GpsInfo) res.getData();
		System.out.println(data.getObd_stagus());*/
//		Photo data = (Photo) res.getData();
//		System.out.println(data.getSize());
		/*Map<String, Object> res = terminal.anlysis();
		System.out.println(res);
		String string = terminal.photo("120000");
		System.out.println(string);*/
	}











	
}
