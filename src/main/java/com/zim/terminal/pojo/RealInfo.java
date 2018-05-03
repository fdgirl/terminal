package com.zim.terminal.pojo;

/**
 * 实时整车数据
 */
public class RealInfo {
    /**
     * 车载终端ID
     */
    private String equipment_id;
    /**
     * 车辆唯一标识（车架号）
     */
    private String car_unique_id;
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
     * 报警标志4，预留
     */
    private int alarm_status_4;
    /**
     * 报警标志5，预留
     */
    private int alarm_status_5;
    /**
     * 报警标志6，预留
     */
    private int alarm_status_6;
    /**
     * 报警标志7，预留
     */
    private int alarm_status_7;
    /**
     * 报警标志8，预留
     */
    private int alarm_status_8;
    /**
     * 报警标志9，预留
     */
    private int alarm_status_9;
    /**
     * 报警标志10，预留
     */
    private int alarm_status_a;
    /**
     * 报警标志11，预留
     */
    private int alarm_status_b;
    /**
     * 报警标志12，预留
     */
    private int alarm_status_c;
    /**
     * 报警标志13，预留
     */
    private int alarm_status_d;
    /**
     * 报警标志14，预留
     */
    private int alarm_status_e;
    /**
     * 报警标志15，预留
     */
    private int alarm_status_f;
    /**
     * 接收数据时间，单位：毫秒
     */
    private long accept_time;
    /**
     * 最后定位时间
     */
    private long gps_time;
    /**
     * ACC状态：1为AccOn 0为AccOff
     */
    private int acc_status;

    public String getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getCar_unique_id() {
        return car_unique_id;
    }

    public void setCar_unique_id(String car_unique_id) {
        this.car_unique_id = car_unique_id;
    }

     public int getNetwork_status() {
        return network_status;
    }

    public void setNetwork_status(int network_status) {
        this.network_status = network_status;
    }

    public int getCharge_status() {
        return charge_status;
    }

    public void setCharge_status(int charge_status) {
        this.charge_status = charge_status;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getGps_speed() {
        return gps_speed;
    }

    public void setGps_speed(double gps_speed) {
        this.gps_speed = gps_speed;
    }

    public int getMind_cons() {
        return mind_cons;
    }

    public void setMind_cons(int mind_cons) {
        this.mind_cons = mind_cons;
    }

    public int getDiretion() {
        return diretion;
    }

    public void setDiretion(int diretion) {
        this.diretion = diretion;
    }

    public int getAlarm() {
        return alarm;
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }

    public int getPower_model() {
        return power_model;
    }

    public void setPower_model(int power_model) {
        this.power_model = power_model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getTotal_volatge() {
        return total_volatge;
    }

    public void setTotal_volatge(int total_volatge) {
        this.total_volatge = total_volatge;
    }

    public int getTotal_electicity() {
        return total_electicity;
    }

    public void setTotal_electicity(int total_electicity) {
        this.total_electicity = total_electicity;
    }

    public int getSoc() {
        return soc;
    }

    public void setSoc(int soc) {
        this.soc = soc;
    }

    public int getLaunch_status() {
        return launch_status;
    }

    public void setLaunch_status(int launch_status) {
        this.launch_status = launch_status;
    }

    public int getMileage_surplus() {
        return mileage_surplus;
    }

    public void setMileage_surplus(int mileage_surplus) {
        this.mileage_surplus = mileage_surplus;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getObd_stagus() {
        return obd_stagus;
    }

    public void setObd_stagus(int obd_stagus) {
        this.obd_stagus = obd_stagus;
    }

    public String getMachine_version() {
        return machine_version;
    }

    public void setMachine_version(String machine_version) {
        this.machine_version = machine_version;
    }

    public int getGprs_signal() {
        return gprs_signal;
    }

    public void setGprs_signal(int gprs_signal) {
        this.gprs_signal = gprs_signal;
    }

    public int getGps_signal() {
        return gps_signal;
    }

    public void setGps_signal(int gps_signal) {
        this.gps_signal = gps_signal;
    }

    public int getPositioning_validity() {
        return positioning_validity;
    }

    public void setPositioning_validity(int positioning_validity) {
        this.positioning_validity = positioning_validity;
    }

    public int getRunning_lights() {
        return running_lights;
    }

    public void setRunning_lights(int running_lights) {
        this.running_lights = running_lights;
    }

    public int getReturn_car_status() {
        return return_car_status;
    }

    public void setReturn_car_status(int return_car_status) {
        this.return_car_status = return_car_status;
    }

    public int getReady_status() {
        return ready_status;
    }

    public void setReady_status(int ready_status) {
        this.ready_status = ready_status;
    }

    public int getAlarm_status_4() {
        return alarm_status_4;
    }

    public void setAlarm_status_4(int alarm_status_4) {
        this.alarm_status_4 = alarm_status_4;
    }

    public int getAlarm_status_5() {
        return alarm_status_5;
    }

    public void setAlarm_status_5(int alarm_status_5) {
        this.alarm_status_5 = alarm_status_5;
    }

    public int getAlarm_status_6() {
        return alarm_status_6;
    }

    public void setAlarm_status_6(int alarm_status_6) {
        this.alarm_status_6 = alarm_status_6;
    }

    public int getAlarm_status_7() {
        return alarm_status_7;
    }

    public void setAlarm_status_7(int alarm_status_7) {
        this.alarm_status_7 = alarm_status_7;
    }

    public int getAlarm_status_8() {
        return alarm_status_8;
    }

    public void setAlarm_status_8(int alarm_status_8) {
        this.alarm_status_8 = alarm_status_8;
    }

    public int getAlarm_status_9() {
        return alarm_status_9;
    }

    public void setAlarm_status_9(int alarm_status_9) {
        this.alarm_status_9 = alarm_status_9;
    }

    public int getAlarm_status_a() {
        return alarm_status_a;
    }

    public void setAlarm_status_a(int alarm_status_a) {
        this.alarm_status_a = alarm_status_a;
    }

    public int getAlarm_status_b() {
        return alarm_status_b;
    }

    public void setAlarm_status_b(int alarm_status_b) {
        this.alarm_status_b = alarm_status_b;
    }

    public int getAlarm_status_c() {
        return alarm_status_c;
    }

    public void setAlarm_status_c(int alarm_status_c) {
        this.alarm_status_c = alarm_status_c;
    }

    public int getAlarm_status_d() {
        return alarm_status_d;
    }

    public void setAlarm_status_d(int alarm_status_d) {
        this.alarm_status_d = alarm_status_d;
    }

    public int getAlarm_status_e() {
        return alarm_status_e;
    }

    public void setAlarm_status_e(int alarm_status_e) {
        this.alarm_status_e = alarm_status_e;
    }

    public int getAlarm_status_f() {
        return alarm_status_f;
    }

    public void setAlarm_status_f(int alarm_status_f) {
        this.alarm_status_f = alarm_status_f;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getAccept_time() {
        return accept_time;
    }

    public void setAccept_time(long accept_time) {
        this.accept_time = accept_time;
    }

    public long getGps_time() {
        return gps_time;
    }

    public void setGps_time(long gps_time) {
        this.gps_time = gps_time;
    }

    public int getAcc_status() {
        return acc_status;
    }

    public void setAcc_status(int acc_status) {
        this.acc_status = acc_status;
    }
}
