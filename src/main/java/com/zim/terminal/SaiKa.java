package com.zim.terminal;


public class SaiKa implements Terminal {

	@Override
	public String[] anlysis(String string) {
		
		String[] str = {"000B12","start","test"};
		return str;
	}

	@Override
	public String lock() {
		// TODO 自动生成的方法存根
		return "success";
	}
	
	public void zhuan() {
		System.out.println("SaiKa");
	}

	@Override
	public String ignite() {
		// TODO 自动生成的方法存根
		return null;
	}

}
