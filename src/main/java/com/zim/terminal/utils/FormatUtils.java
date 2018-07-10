package com.zim.terminal.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatUtils {

    /*
     * 字节数组转16进制字符串
     */
    public static String byteToHexStr(byte[] b) {
        StringBuilder str = new StringBuilder();
        if (b == null || b.length <= 0) {
            return null;
        }
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
            	str.append("0".concat(hex));
            }else {
            	str.append(hex);
            }
        }
        return str.toString().toUpperCase();
    }
    
    //字符串转字节数组
    public static byte[] strToByte(String string) {
    	byte[] bytes = new byte[string.length()>>1];
    	for (int i = 0,j = 0; i < string.length(); i += 2,j++) {
			 String str = string.substring(i, i +2);
			 int num = Integer.parseInt(str,16);
			 bytes[j] = (byte) num;
        } 
		return bytes;	
	}
    
    public static boolean vaildata(byte[] bytes,int length) {
    	if(bytes.length<2) {
    		return false;
    	}
    	byte check = bytes[length+14];
        byte[] buff = new byte[length+13]; // 去头掐尾
        // (0xaa)的头,(校验,0xaa)的尾
        System.arraycopy(bytes, 1, buff, 0, buff.length);
        byte srcCheck = bytesOr(buff);
        if (srcCheck != check) {
        	return false;
        }
		return true;
    }
    
    /**
     * 获取校验
     */
    public static byte bytesOr(byte[] bytes) {
        byte re = bytes[0];
        for (int i = 1; i < bytes.length; i++) {
            re = (byte) (re ^ bytes[i]);
        }
        return re;
    }
    
    /**
	 * 二进制数据操作,获取waring中二进制表示中其第index位的数值
	 */
	public static int getBinIndex(int number,int index){
		return (number & (0x1 << index)) >> index;
	}
	
	/**
	 * byte数组相连
	 */
	public static byte[] bytesConcat  (byte[]a,byte[]b){ 
		if (a == null) return b; 
		if (b == null) return a; 
		byte[] r = new byte[a.length+b.length]; 
		System.arraycopy(a, 0, r, 0, a.length); 
		System.arraycopy(b, 0, r, a.length, b.length); 
		return r; 		     
	}
	
    /**
     * 将Date类型按pattern指定的格式转换为字符串
     */
    public static String date2Str(Date date, String pattern) {
        SimpleDateFormat sdFormat = new SimpleDateFormat(pattern);
        return sdFormat.format(date);
    }

    /**
     * 获取流水号
     */
    public static byte getSN() {
        Date date = new Date();
        String pattern = "SSSS";
        String ss = date2Str(date, pattern);
        return Byte.parseByte(ss.substring(pattern.length() > 2 ? (pattern.length() - 2) : 0));
    }
    
    
    public static String byteToBinStr(byte sro){
		StringBuilder stringBuilder = new StringBuilder();  
		int v = sro & 0xff;
		String hv = Integer.toBinaryString(v);
		stringBuilder.append(hv);
		while (stringBuilder.length() < 8) {
			stringBuilder.insert(0, '0');	
		}
		return stringBuilder.toString();
	}
    
}
