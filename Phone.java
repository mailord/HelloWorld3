package cn.itcast.system;

public class Phone {
/*String���͵�Ʒ��
	int���͵�ʣ�����
	set��get����
	�Ǿ�̬�޲��޷���ֵ�ĳ�Ա������
	checkPower()��������ʵ�֣��жϵ�ǰ�����ʣ����������ʣ���������20����ô�ڿ���̨��ӡ���������ͣ����硱��*/
	
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
			System.out.println("��������,����");
		}
	}
}
