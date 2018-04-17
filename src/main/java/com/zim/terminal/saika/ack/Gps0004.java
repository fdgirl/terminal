package com.zim.terminal.saika.ack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.zim.terminal.utils.FormatUtils;

public class Gps0004 {
	protected String data;
	protected byte[] message;
	
	public Gps0004(String string) {
		this.data = string;
		if(string.length()>28)
			this.message = FormatUtils.strToByte(string);			
	}
	
	public Map<String, Object> Analysis() {
		if (message == null || data==null)
            return null;
		int length = Integer.parseInt(data.substring(24,28),16);			
//		if(FormatUtils.vaildata(message,length) != true)
//			return null;
		
		Map<String, Object> params = new HashMap<>();
		String terminalId = data.substring(2, 22);
		params.put("terminal_id", terminalId);
		params.put("message_sn", message[11]);
		params.put("lenght", length);
		params.put("type", message[14]+message[15]);
		
		StringBuilder timeStr = new StringBuilder();
		timeStr.append("20");
		timeStr.append(data.substring(32,44));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		long time = 0;
		try {
			Date date= sdf.parse(timeStr.toString());
			time = date.getTime();
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(time< 1511008433000L) {
			time = System.currentTimeMillis();
		}
		params.put("time",time );
		
		params.put("obd_stagus", FormatUtils.getBinIndex(message[23],0));
		params.put("running_lights", FormatUtils.getBinIndex(message[23],1));
		params.put("return_car_status", FormatUtils.getBinIndex(message[23],2));
		params.put("ready_status", FormatUtils.getBinIndex(message[23],3));
		params.put("long_term_lease", FormatUtils.getBinIndex(message[23],4));
		
		params.put("door", FormatUtils.getBinIndex(message[24], 0));
		params.put("positioning_validity", FormatUtils.getBinIndex(message[24], 1));
		params.put("mind_cons", FormatUtils.getBinIndex(message[24], 4));
		params.put("alarm", FormatUtils.getBinIndex(message[24], 5));
		params.put("acc_status", FormatUtils.getBinIndex(message[24], 6));
		params.put("charge_status", FormatUtils.getBinIndex(message[24], 7));
		
		params.put("gps_signal", Integer.parseInt(data.substring(50,52),16));
		if(params.get("positioning_validity").equals(1)) {
			double longitude = Double.parseDouble(data.substring(52, 55)) + Double.parseDouble("0." + data.substring(55, 62)) / 60 * 100;
			params.put("longitude", longitude);
			double latitude = Double.parseDouble(data.substring(62, 64)) + Double.parseDouble("0." + data.substring(64, 70)) / 60 * 100;
			params.put("latitude", latitude);
			params.put("diretion", (message[35] & 0xFF) *2);
			params.put("gps_speed", message[36] & 0xFF);			
		}
		
		params.put("speed", message[37] & 0xFF);
		switch (message[38]) {
			case 0x0B:
				params.put("gear", "E");
				break;
			case 0x0C:
				params.put("gear", "R");
				break;
			case 0x0D:
				params.put("gear", "N");
				break;
			case 0x0E:
				params.put("gear", "D");
				break;
			case 0x0F:
				params.put("gear", "P");
				break;
			default:
				params.put("gear", "null");
				break;
		}
		params.put("soc", Integer.parseInt(data.substring(78,82),16));
		params.put("mileage_surplus", Integer.parseInt(data.substring(82,86),16));
		params.put("voltage", message[43] & 0xFF);
		params.put("mileage", Integer.parseInt(data.substring(88,96),16));
		params.put("total_volatge", Integer.parseInt(data.substring(96,100),16));
		params.put("total_electicity", Integer.parseInt(data.substring(100,104),16));
		
		int v1 = Integer.parseUnsignedInt(data.substring(104,106),16);
		int v2 = Integer.parseUnsignedInt(data.substring(106,108),16) / 10;
		int v3 = Integer.parseUnsignedInt(data.substring(106,108),16) % 10;
		StringBuilder machine_version = new StringBuilder();
		machine_version.append(v1);
		machine_version.append(".");
		machine_version.append(v2);
		machine_version.append(".");
		machine_version.append(v3);
		params.put("machine_version", machine_version.toString());
		
		params.put("gprs_signal", message[54] & 0xFF);
		
		return params;
	}
	
	public static void main(String[] args) {
		Gps0004 ask = new Gps0004("AA0000000B121171118001B60029000417111820335300001E091133011120230927607500000F000000000B000000000000000002291A04AA");
		System.out.println(ask.Analysis());
		/*
		 * 1511008433000
		 * 1523785289236
		 * 1523785314000
		*/
		
	}
}
