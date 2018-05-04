package com.zim.terminal;

import com.zim.terminal.pojo.Analysis;

public interface Terminal {
	
	public Analysis<Object> anlysis(byte[] bytes);
	
	public byte[] sreverAck(String string,boolean bool);
	
	public byte[] heartBeat(String terminal);
	
	public byte[] update(String terminal,String version,String ftp);
	
	public byte[] lock(String terminal,boolean bool);
	
	public byte[] ignite(String terminal,boolean bool);
	
	public byte[] whistle(String terminal,boolean bool);
	
	public byte[] initBluetooth(String terminal);
	
	public byte[] password(String terminal,String password);
	
	public byte[] photo(String terminal);
	
	public byte[] rent(String terminal,int type);
	
}
