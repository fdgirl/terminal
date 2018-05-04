package com.zim.terminal.saika.ack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.zim.terminal.pojo.GpsInfo;
import com.zim.terminal.utils.FormatUtils;

public class Gps0004 {
	protected String data;
	protected byte[] message;
	
	public Gps0004(byte[] bytes) {
		this.message = bytes;
		if(bytes.length>14)
			this.data = FormatUtils.byteToHexStr(bytes);			
	}
	
	public GpsInfo analysis() {
		if (message == null || data==null)
            return null;
		int length = Integer.parseInt(data.substring(24,28),16);			
		if(FormatUtils.vaildata(message,length) != true)
			return null;
		GpsInfo params = new GpsInfo();
		
		String terminalId = data.substring(2, 22);
		params.setEquipment_id(terminalId);
		params.setMessage_sn(message[11]);
		params.setLenght(length);
		params.setType(message[14]+message[15]);
		
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
		params.setTime(time);
		
		params.setObd_stagus(FormatUtils.getBinIndex(message[23],0));
		params.setRunning_lights(FormatUtils.getBinIndex(message[23],1));
		params.setReturn_car_status(FormatUtils.getBinIndex(message[23],2));
		params.setReady_status(FormatUtils.getBinIndex(message[23],3));
		params.setLong_term_lease(FormatUtils.getBinIndex(message[23],4));
		
		params.setDoor(FormatUtils.getBinIndex(message[24], 0));
		params.setPositioning_validity(FormatUtils.getBinIndex(message[24], 1));
		params.setMind_cons(FormatUtils.getBinIndex(message[24], 4));
		params.setAlarm(FormatUtils.getBinIndex(message[24], 5));
		params.setAcc_status(FormatUtils.getBinIndex(message[24], 6));
		params.setCharge_status(FormatUtils.getBinIndex(message[24], 7));
		
		params.setGps_signal(Integer.parseInt(data.substring(50,52),16));
		if(params.getPositioning_validity()==1) {
			double longitude = Double.parseDouble(data.substring(52, 55)) + Double.parseDouble("0." + data.substring(55, 62)) / 60 * 100;
			params.setLongitude(longitude);
			double latitude = Double.parseDouble(data.substring(62, 64)) + Double.parseDouble("0." + data.substring(64, 70)) / 60 * 100;
			params.setLatitude(latitude);
			params.setDiretion((message[35] & 0xFF) *2);
			params.setGps_speed(message[36] & 0xFF);			
		}
		
		params.setSpeed(message[37] & 0xFF);
		switch (message[38]) {
			case 0x0B:
				params.setGear("E");
				break;
			case 0x0C:
				params.setGear("R");
				break;
			case 0x0D:
				params.setGear("N");
				break;
			case 0x0E:
				params.setGear("D");
				break;
			case 0x0F:
				params.setGear("P");
				break;
			default:
				params.setGear("null");
				break;
		}
		params.setSoc(Integer.parseInt(data.substring(78,82),16));
		params.setMileage_surplus(Integer.parseInt(data.substring(82,86),16));
		params.setVoltage(message[43] & 0xFF);
		params.setMileage(Integer.parseInt(data.substring(88,96),16));
		params.setTotal_volatge(Integer.parseInt(data.substring(96,100),16));
		params.setTotal_electicity(Integer.parseInt(data.substring(100,104),16));
		
		int v1 = Integer.parseUnsignedInt(data.substring(104,106),16);
		int v2 = Integer.parseUnsignedInt(data.substring(106,108),16) / 10;
		int v3 = Integer.parseUnsignedInt(data.substring(106,108),16) % 10;
		StringBuilder machine_version = new StringBuilder();
		machine_version.append(v1);
		machine_version.append(".");
		machine_version.append(v2);
		machine_version.append(".");
		machine_version.append(v3);
		params.setMachine_version(machine_version.toString());
		
		params.setGprs_signal(message[54] & 0xFF);
		
		return params;
	}
	
}
