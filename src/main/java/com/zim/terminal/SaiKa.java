package com.zim.terminal;

import java.util.HashMap;
import java.util.Map;

import com.zim.terminal.saika.ack.Ack0001;
import com.zim.terminal.saika.ack.Ack8XXX;
import com.zim.terminal.saika.ack.Gps0004;

public class SaiKa implements Terminal {
	
	public Map<String, Object> anlysis(String string) {
		if(string==null) {
			return null;
		}
		Map<String, Object> params = new HashMap<>();

		params.put("terminal_id", string.substring(2,22));
		switch (Integer.parseInt(string.substring(30, 32),16)) {
		case 0x01:
			params.put("type", "ack");
			params.put("data",new Ack0001(string).analysis());
			break;
		case 0x03:
			
			break;
		case 0x04:
			params.put("type", "gps");
			params.put("data",new Gps0004(string).analysis());
			break;
		default:
			break;
		} 
		return params;
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
		Terminal terminal = new SaiKa();
		Map<String, Object> res = terminal.anlysis("AA0000000B121171118001B60029000417111820335300001E091133011120230927607500000F000000000B000000000000000002291A04AA");
		System.out.println(res);
		String string = terminal.photo("120000");
		System.out.println(string);
	}











	
}
