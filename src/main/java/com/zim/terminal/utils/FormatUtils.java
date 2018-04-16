package com.zim.terminal.utils;

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
    public static void main(String[] args) {
    	byte[] tid = new byte[]{(byte) 0xff, (byte) 0x0f, (byte) 0xff,
                (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
                (byte) 0xff, (byte) 0xff, (byte) 0xff};
    	String aaa =  byteToHexStr(tid);
    	System.out.println(aaa);
    	byte[] bs = strToByte(aaa);
    	String bbb =  byteToHexStr(bs);
    	System.out.println(bbb);    	
	}
    

}
