package com.zim.terminal;

import com.zim.terminal.pojo.Analysis;
import com.zim.terminal.saika.ack.Ack8XXX;

public class Automatic implements Terminal {

	
	public Analysis<Object> anlysis(byte[] bytes) {
		if((bytes[1]+bytes[2]+bytes[3])==0) {
			return new SaiKa().anlysis(bytes);
		}

		return null;
	}
	public byte[] sreverAck(String string, boolean bool) {
		if(string.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8001(string, bool);
		}
		return null;
	}

	@Override
	public byte[] heartBeat(String terminal) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8006(terminal);
		}
		return null;
	}

	@Override
	public byte[] update(String terminal, String version,String ftp) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return new SaiKa().update(terminal, version, ftp);
		}
		return null;
	}

	@Override
	public byte[] lock(String terminal, boolean bool) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8009(terminal,bool);
		}
		return null;
	}

	@Override
	public byte[] ignite(String terminal, boolean bool) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800A(terminal,bool);
		}
		return null;
	}

	@Override
	public byte[] whistle(String terminal, boolean bool) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800C(terminal,bool);
		}
		return null;
	}

	@Override
	public byte[] initBluetooth(String terminal) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800D(terminal);
		}
		return null;
	}

	@Override
	public byte[] password(String terminal, String password) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800E(terminal,password);
		}
		return null;
	}

	@Override
	public byte[] photo(String terminal) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack800F(terminal);
		}
		return null;
	}

	@Override
	public byte[] rent(String terminal, int type) {
		if(terminal.substring(0, 7).equals("0000000")) {
			return Ack8XXX.ack8010(terminal, type);
		}
		return null;
	}

}
