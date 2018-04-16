package com.zim.terminal.saika.ack;

public class Ack8XXX {
	
	public static String ack8001(String terminal,boolean bool) {
		StringBuffer tsb = new StringBuffer("AA");
		tsb.append(terminal.substring(2, 22));
		tsb.append("8001");

		switch (Integer.parseInt(terminal.substring(28,32),16)) {
		case 0x01:
			tsb.append("0001");
			break;
		case 0x03:
			tsb.append("0003");
			break;
		case 0x04:
			tsb.append("0004");
			break;
			
		default:
			break;
		}
		
		tsb.append(terminal.substring(22,24));
		
		if(bool) {
			tsb.append("00");
		}else {
			tsb.append("01");
		}
		
		tsb.append("AA");
		
		return tsb.toString();
	}
	
	public static void ack8006() {
		
	}
	public static void main(String[] args) {
		String reString = ack8001("AA0000000B121171118001B60029000417111820335300001E091133011120230927607500000F000000000B000000000000000002291A04AA", true);
		System.out.println(reString);
	}
}
