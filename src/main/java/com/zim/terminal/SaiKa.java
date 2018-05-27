package com.zim.terminal;

import com.zim.terminal.pojo.Analysis;
import com.zim.terminal.saika.ack.Ack0001;
import com.zim.terminal.saika.ack.Ack8XXX;
import com.zim.terminal.saika.ack.Gps0004;
import com.zim.terminal.saika.ack.Image0003;

public class SaiKa implements Terminal {
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
			returnResult.setData(new Image0003(bytes).analysis());
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
	
	public byte[] sreverAck(String string, boolean bool) {
		return Ack8XXX.ack8001(string, bool);
	}
	
	public byte[] heartBeat(String terminal) {
		return Ack8XXX.ack8006(terminal);
	}
	
	//"ftp:120.79.31.177,21,cheji,cheji"
	public byte[] update(String terminal, String version,String ftp) {
		StringBuilder address = new StringBuilder(ftp);
		address.append(",openatE");
		address.append(version.replaceAll("\\.", "").replaceAll("V", "").replaceAll("v", ""));
		address.append(".dll");
		System.out.println(address);
		return Ack8XXX.ack8008(terminal,address.toString());
	}
	
	public byte[] lock(String terminal,boolean bool) {
		return Ack8XXX.ack8009(terminal,bool);
	}
	
	public byte[] ignite(String terminal,boolean bool) {
		return Ack8XXX.ack800A(terminal,bool);
	}
	
	public byte[] whistle(String terminal, boolean bool) {
		return Ack8XXX.ack800C(terminal,bool);
	}

	public byte[] initBluetooth(String terminal) {
		return Ack8XXX.ack800D(terminal);
	}

	public byte[] password(String terminal, String password) {
		return Ack8XXX.ack800E(terminal,password);
	}
	
	public byte[] photo(String terminal) {
		return Ack8XXX.ack800F(terminal);
	}
	
	public byte[] rent(String terminal,int type) {
		return Ack8XXX.ack8010(terminal, type);
	}
	
	public byte[] secret(String terminal,String productKey,String secret) {
		if(productKey.length()!=11 || secret.length()!=32) {
			return null;
		}
		return Ack8XXX.ack8011(terminal,productKey,secret);
	}
	public static void main(String[] args) {
		/*Terminal terminal = new Automatic();
		String base= "qgAAAAsSEAAAAAH+AAYAAYAMBAB5qg==";
    	byte[] analysis = null;
		analysis = decoder.decode(base);
//    	analysis = FormatUtils.strToByte("AA0000000B121171118001B60019000300FF01010203040512062415305511604000003332000005AA");
		Analysis<Object> res = terminal.anlysis(analysis);
		System.out.println(res.getType());*/
//		Photo data = (Photo) res.getData();
//		System.out.println(data);
//		System.err.println(data.getBis());
//		GpsInfo data = (GpsInfo) res.getData();
//		System.out.println(data.getObd_stagus());
//		Photo data = (Photo) res.getData();
//		System.out.println(data.getSize());
		/*Map<String, Object> res = terminal.anlysis();
		System.out.println(res);
		String string = terminal.photo("120000");
		System.out.println(string);*/
//		AckInfo ackInfo = (AckInfo) res.getData();
//		System.out.println(ackInfo.isStatus());
	}











	
}
