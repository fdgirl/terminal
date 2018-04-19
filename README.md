# terminal
com.zim.terminal 

根接口com.zim.terminal.Terminal

方法
	//处理设备上传数据
	@string完整车机上传数据
	返回map对象
	data键为数据
	type类型为数据类型 (ack为控制器ACK,gps为整车数据) 
	terminal_id为设备id
	public Map<String, Object> anlysis(String string);
	
	//服务器应答ACK 参数1为完整的设备数据 2为前面数据处理的结果
	public String sreverAck(String string,boolean bool);
	
	//心跳检测 参数为设备ID
	public String heartBeat(String terminal);
	
	//车机升级
	@terminal 设备ID
	@version  版本号
	public String update(String terminal,String version);
	
	//远程开落锁
	@terminal 设备ID
	@bool    开锁为true 
	public String lock(String terminal,boolean bool);
	
	//远程点熄火
	@terminal 设备ID
	@bool    点火true 
	public String ignite(String terminal,boolean bool);
	
	//远程鸣笛
	@terminal 设备ID
	@bool    鸣笛为true false无效 
	public String whistle(String terminal,boolean bool);
	
	//蓝牙复位
	设备ID
	public String initBluetooth(String terminal);
	
	修改蓝牙密码
	设备ID
	密码字符串最长为16位
	public String password(String terminal,String password);
	
	拍照
	@terminal设备ID
	public String photo(String terminal);
	
	长租类型
	@terminal设备ID
	@int 租赁类型
	public String rent(String terminal,int type);
	
例:
	1.
```
/*
	SaiKa为处理赛卡数据实现类
*/
Terminal terminal = new SaiKa();
		Map<String, Object> res = terminal.anlysis("AA0000000B121171118001B60029000417111820335300001E091133011120230927607500000F000000000B000000000000000002291A04AA");
		System.out.println(res);
```
	2.
```
	Terminal terminal = new SaiKa();
	String res = terminal.lock("0000000B121171118001",true);
	System.out.println(res);
```
	3.
```
/*
	Automatic类为自动处理 只需要设备ID自动判断车机厂商
*/
	Terminal terminal = new Automatic();
```



	