package com.zim.terminal;

import java.util.Map;

public interface Terminal {
	
	public Map<String, Object> anlysis(String string);
	
	public String sreverAck(String string,boolean bool);
	
	public String heartBeat(String terminal);
	
	public String update(String terminal,String version);
	
	public String lock(String terminal,boolean bool);
	
	public String ignite(String terminal,boolean bool);
	
	public String whistle(String terminal,boolean bool);
	
	public String initBluetooth(String terminal);
	
	public String password(String terminal,String password);
	
	public String photo(String terminal);
	
	public String rent(String terminal,int type);
	
}
