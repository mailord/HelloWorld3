package cn.itcast.system;

public class Phone {
/*String类型的品牌
	int类型的剩余电量
	set和get方法
	非静态无参无返回值的成员方法：
	checkPower()。方法内实现：判断当前对象的剩余电量，如果剩余电量低于20，那么在控制台打印“电量过低，请充电”。*/
	
	String band;
	int power;
	public void setBand(String band){
		this.band = band;
	}
	public void setPower(int power){
		this.power = power;
	}
	public String getBand(String band){
		return band;
	}
	public int getPower(int power){
		return power;
	}
	public void checkPower(){
		if(power < 20){
			System.out.println("电量过低,请充电");
		}
	}
}
