package com.zim.terminal.pojo;

/**
 * 实时整车数据
 */
public class GpsInfo {
    /**
     * 车载终端ID
     */
    private String equipment_id;
    /**
     * 消息流水
     */
    private int message_sn;
    private int lenght;
    private int type;
    /**
     * 终端数据时间，单位：毫秒
     */
    private long time;
    /**
     * 是否离线 0:离线;1:在线
     */
    private int network_status = 1;
    /**
     * 充放电状态 0:未充电;1:充电
     */
    private int charge_status;
    /**
     * 经度
     */
    private double longitude; //经度
    /**
     * 纬度
     */
    private double latitude;
    /**
     * 速度 KM/H
     */
    private double speed;
    /**
     * GPS速度 km/h (使用GSM经纬度时表示精确度的低8位)
     */
    private double gps_speed;
    /**
     * 中控锁状态，1为锁 0为未锁
     */
    private int mind_cons;
    /**
     * 方向正北为 0，范围 0---180每两度表示一度     表示：20
     */
    private int diretion;
    /**
     * 防盗报警状态 1:报警; 0:正常
     */
    private int alarm;
    /**
     * 动力模式: 1.纯电; 2:混动; 3:燃油; 4:异常
     */
    private int power_model = 1;
    /**
     * 总里程 km ，计量单元：0.1km
     */
    private int mileage;
    /**
     * 总电压 单位:v  计量单元：0.1V
     */
    private int total_volatge;
    /**
     * 总电流 单位:A  计量单元：0.1A
     */
    private int total_electicity;
    /**
     * 电量百分比  单位0.1%
     */
    private int soc;
    /**
     * 点熄火状态: 0熄火 1点火
     */
    private int launch_status;
    /**
     * 续航里程  单位0.1km
     */
    private int mileage_surplus;
    /**
     * 门状态(含后背箱) 0:所有门已关闭  1:存在打开的门
     */
    private int door;
    /**
     * 小电瓶电压 单位V
     */
    private float voltage;
    /**
     * 档位  节能档E; 倒档R; 空档N; 自动D档; 停车P档
     */
    private String gear;
    /**
     * OBD拔插状态 : 0:拔掉 1:插上
     */
    private int obd_stagus;
    /**
     * 车机版本号
     */
    private String machine_version;
    /**
     * GPRS信号强度
     */
    private int gprs_signal;
    /**
     * GPS信号强度
     */
    private int gps_signal;
    /**
     * 定位数据有效性 0无效 1有效
     */
    private int positioning_validity;
    /**
     * 行车灯/示宽灯，1为开，0为关
     */
    private int running_lights;
    /**
     * 可还车状态，1为可还车  0为不可还车
     */
    private int return_car_status;
    /**
     * Ready状态，1为ReadyON 0为ReadyOff
     */
    private int ready_status;
    /**
     * 0 为分时用车， 1 为长租用车
     */
    private int long_term_lease;
  
    /**
     * 控车锁状态 1为锁定 0 为未锁定
     */
    private int control_lock;
    
    /**
     * ACC状态：1为AccOn 0为AccOff
     */
    private int acc_status;
	/**
	 * @return equipment_id
	 */
	public String getEquipment_id() {
		return equipment_id;
	}
	/**
	 * @param equipment_id 要设置的 equipment_id
	 */
	public void setEquipment_id(String equipment_id) {
		this.equipment_id = equipment_id;
	}
	/**
	 * @return message_sn
	 */
	public int getMessage_sn() {
		return message_sn;
	}
	/**
	 * @param message_sn 要设置的 message_sn
	 */
	public void setMessage_sn(int message_sn) {
		this.message_sn = message_sn;
	}
	/**
	 * @return lenght
	 */
	public int getLenght() {
		return lenght;
	}
	/**
	 * @param lenght 要设置的 lenght
	 */
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	/**
	 * @return type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type 要设置的 type
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @param time 要设置的 time
	 */
	public void setTime(long time) {
		this.time = time;
	}
	/**
	 * @return obd_stagus
	 */
	public int getObd_stagus() {
		return obd_stagus;
	}
	/**
	 * @param obd_stagus 要设置的 obd_stagus
	 */
	public void setObd_stagus(int obd_stagus) {
		this.obd_stagus = obd_stagus;
	}
	/**
	 * @return running_lights
	 */
	public int getRunning_lights() {
		return running_lights;
	}
	/**
	 * @param running_lights 要设置的 running_lights
	 */
	public void setRunning_lights(int running_lights) {
		this.running_lights = running_lights;
	}
	/**
	 * @return return_car_status
	 */
	public int getReturn_car_status() {
		return return_car_status;
	}
	/**
	 * @param return_car_status 要设置的 return_car_status
	 */
	public void setReturn_car_status(int return_car_status) {
		this.return_car_status = return_car_status;
	}
	/**
	 * @return ready_status
	 */
	public int getReady_status() {
		return ready_status;
	}
	/**
	 * @param ready_status 要设置的 ready_status
	 */
	public void setReady_status(int ready_status) {
		this.ready_status = ready_status;
	}
	/**
	 * @return long_term_lease
	 */
	public int getLong_term_lease() {
		return long_term_lease;
	}
	/**
	 * @param long_term_lease 要设置的 long_term_lease
	 */
	public void setLong_term_lease(int long_term_lease) {
		this.long_term_lease = long_term_lease;
	}
	/**
	 * @return door
	 */
	public int getDoor() {
		return door;
	}
	/**
	 * @param door 要设置的 door
	 */
	public void setDoor(int door) {
		this.door = door;
	}
	/**
	 * @return positioning_validity
	 */
	public int getPositioning_validity() {
		return positioning_validity;
	}
	/**
	 * @param positioning_validity 要设置的 positioning_validity
	 */
	public void setPositioning_validity(int positioning_validity) {
		this.positioning_validity = positioning_validity;
	}
	/**
	 * @return mind_cons
	 */
	public int getMind_cons() {
		return mind_cons;
	}
	/**
	 * @param mind_cons 要设置的 mind_cons
	 */
	public void setMind_cons(int mind_cons) {
		this.mind_cons = mind_cons;
	}
	/**
	 * @return alarm
	 */
	public int getAlarm() {
		return alarm;
	}
	/**
	 * @param alarm 要设置的 alarm
	 */
	public void setAlarm(int alarm) {
		this.alarm = alarm;
	}
	/**
	 * @return acc_status
	 */
	public int getAcc_status() {
		return acc_status;
	}
	/**
	 * @param acc_status 要设置的 acc_status
	 */
	public void setAcc_status(int acc_status) {
		this.acc_status = acc_status;
	}
	/**
	 * @return charge_status
	 */
	public int getCharge_status() {
		return charge_status;
	}
	/**
	 * @param charge_status 要设置的 charge_status
	 */
	public void setCharge_status(int charge_status) {
		this.charge_status = charge_status;
	}
	/**
	 * @return gps_signal
	 */
	public int getGps_signal() {
		return gps_signal;
	}
	/**
	 * @param gps_signal 要设置的 gps_signal
	 */
	public void setGps_signal(int gps_signal) {
		this.gps_signal = gps_signal;
	}
	/**
	 * @return longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude 要设置的 longitude
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude 要设置的 latitude
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return diretion
	 */
	public int getDiretion() {
		return diretion;
	}
	/**
	 * @param diretion 要设置的 diretion
	 */
	public void setDiretion(int diretion) {
		this.diretion = diretion;
	}
	/**
	 * @return gps_speed
	 */
	public double getGps_speed() {
		return gps_speed;
	}
	/**
	 * @param gps_speed 要设置的 gps_speed
	 */
	public void setGps_speed(double gps_speed) {
		this.gps_speed = gps_speed;
	}
	/**
	 * @return speed
	 */
	public double getSpeed() {
		return speed;
	}
	/**
	 * @param speed 要设置的 speed
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	/**
	 * @return gear
	 */
	public String getGear() {
		return gear;
	}
	/**
	 * @param gear 要设置的 gear
	 */
	public void setGear(String gear) {
		this.gear = gear;
	}
	/**
	 * @return soc
	 */
	public int getSoc() {
		return soc;
	}
	/**
	 * @param soc 要设置的 soc
	 */
	public void setSoc(int soc) {
		this.soc = soc;
	}
	/**
	 * @return mileage_surplus
	 */
	public int getMileage_surplus() {
		return mileage_surplus;
	}
	/**
	 * @param mileage_surplus 要设置的 mileage_surplus
	 */
	public void setMileage_surplus(int mileage_surplus) {
		this.mileage_surplus = mileage_surplus;
	}
	/**
	 * @return voltage
	 */
	public float getVoltage() {
		return voltage;
	}
	/**
	 * @param voltage 要设置的 voltage
	 */
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	/**
	 * @return mileage
	 */
	public int getMileage() {
		return mileage;
	}
	/**
	 * @param mileage 要设置的 mileage
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	/**
	 * @return total_volatge
	 */
	public int getTotal_volatge() {
		return total_volatge;
	}
	/**
	 * @param total_volatge 要设置的 total_volatge
	 */
	public void setTotal_volatge(int total_volatge) {
		this.total_volatge = total_volatge;
	}
	/**
	 * @return total_electicity
	 */
	public int getTotal_electicity() {
		return total_electicity;
	}
	/**
	 * @param total_electicity 要设置的 total_electicity
	 */
	public void setTotal_electicity(int total_electicity) {
		this.total_electicity = total_electicity;
	}
	/**
	 * @return machine_version
	 */
	public String getMachine_version() {
		return machine_version;
	}
	/**
	 * @param machine_version 要设置的 machine_version
	 */
	public void setMachine_version(String machine_version) {
		this.machine_version = machine_version;
	}
	/**
	 * @return gprs_signal
	 */
	public int getGprs_signal() {
		return gprs_signal;
	}
	/**
	 * @param gprs_signal 要设置的 gprs_signal
	 */
	public void setGprs_signal(int gprs_signal) {
		this.gprs_signal = gprs_signal;
	}
	public int getControl_lock() {
		return control_lock;
	}
	public void setControl_lock(int control_lock) {
		this.control_lock = control_lock;
	}
    public int getNetwork_status() {
        return network_status;
    }
    public void setNetwork_status(int network_status) {
        this.network_status = network_status;
    }
    public int getPower_model() {
        return power_model;
    }
    public void setPower_model(int power_model) {
        this.power_model = power_model;
    }
    public int getLaunch_status() {
        return launch_status;
    }
    public void setLaunch_status(int launch_status) {
        this.launch_status = launch_status;
    }


   
}
