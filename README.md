# terminal
#### com.zim.terminal 

### 根接口com.zim.terminal.Terminal
### 实现类: 
```
	① Automatic(自动区分厂商)
	② SaiKa处理赛卡实现类
```
方法
	//解析车机数据
	Analysis<Object> anlysis(byte[] bytes)
	
	

### 以下为生成控制指令
```java	
	

	//心跳检测 参数为设备ID
	public byte[] heartBeat(String terminal);
	
	//车机升级
	@terminal 设备ID
	@version  版本号
	@ftp  //"ftp:120.79.31.177,21,cheji,cheji"
	public byte[] update(String terminal,String version,String ftp);
	
	//远程开落锁
	@terminal 设备ID
	@bool    开锁为true 
	public byte[] lock(String terminal,boolean bool);
	
	//远程点熄火
	@terminal 设备ID
	@bool    点火true 
	public byte[] ignite(String terminal,boolean bool);
	
	//远程鸣笛
	@terminal 设备ID
	@bool    鸣笛为true false无效 
	public byte[] whistle(String terminal,boolean bool);
	
	//蓝牙复位
	设备ID
	public byte[] initBluetooth(String terminal);
	
	修改蓝牙密码
	设备ID
	密码字符串最长为16位
	public byte[] password(String terminal,String password);
	
	拍照
	@terminal设备ID
	public byte[] photo(String terminal);
	
	长租类型
	@terminal设备ID
	@int 租赁类型
	public byte[] rent(String terminal,int type);
	
	设置IOT String productKey,String DeviceSecret
	@String productKey
	@String DeviceSecret
	public byte[] secret(String terminal,String productKey,String DeviceSecret);
	
```
### 例:
	1.
/*
	Automatic类为自动处理 只需要设备ID自动判断车机厂商
*/
```java
	Terminal terminal = new Automatic();//或者Terminal terminal = new SaiKa();
		Analysis<Object> analysis = terminal.anlysis(decoder.decode(string));
	if(analysis==null)
			return ;
		System.out.println(analysis.getType());
		switch (analysis.getType()) {
		case "ACK":
			(AckInfo) analysis.getData();
			break;
		case "PHOTO":
			(Photo) analysis.getData();
			break;
		case "GPS":
			(GpsInfo) analysis.getData();
			break;
		default:
			break;
		}
```
	2.控制器指令
```java
	Terminal terminal = new Automatic();//或者Terminal terminal = new SaiKa();
	//返回指令
	byte[] ack = terminal.lock("00121008",true);
	//要保存的流水
	int requestSn = ack[11];
```