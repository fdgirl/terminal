package com.zim.terminal;

import java.util.Map;

import com.zim.terminal.saika.ack.Ack8XXX;

public class Automatic implements Terminal {

	@Override
	public Map<String, Object> anlysis(String string) {
		if(string.substring(2, 9).equals("0000000")) {
			return new SaiKa().anlysis(string);
		}

		return null;
	}
	
	public String sreverAck(String string, boolean bool) {
		if(string.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8001(string, bool);
		}
		return null;
	}

	@Override
	public String heartBeat(String terminal) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8006(terminal);
		}
		return null;
	}

	@Override
	public String update(String terminal, String version) {
		if(terminal.substring(0, 7).equals("0000000")) {
			StringBuilder address = new StringBuilder("ftp:120.79.31.177,21,cheji,cheji,openatE");
			address.append(version.replaceAll("\\.", "").replaceAll("V", "").replaceAll("v", ""));
			address.append(".dll");
			System.out.println(address);
			return Ack8XXX.ack8008(terminal,address.toString());
		}
		return null;
	}

	@Override
	public String lock(String terminal, boolean bool) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8009(terminal,bool);
		}
		return null;
	}

	@Override
	public String ignite(String terminal, boolean bool) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800A(terminal,bool);
		}
		return null;
	}

	@Override
	public String whistle(String terminal, boolean bool) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800C(terminal,bool);
		}
		return null;
	}

	@Override
	public String initBluetooth(String terminal) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800D(terminal);
		}
		return null;
	}

	@Override
	public String password(String terminal, String password) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800E(terminal,password);
		}
		return null;
	}

	@Override
	public String photo(String terminal) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800F(terminal);
		}
		return null;
	}

	@Override
	public String rent(String terminal, int type) {
		if(terminal.substring(2, 9).equals("0000000")) {
			return Ack8XXX.ack8010(terminal, type);
		}
		return null;
	}

}
