
public class InitialTest {
	public static void main(String args[]) throws CloneNotSupportedException{
		glass cup = new glass();
		System.out.println(cup.getWeight());
		System.out.println(cup.getRadius());
		glass gl = new glass();
		glass gl2 = gl.clone();
		if(gl == gl2)
			System.out.println("clone��ǳ����");
		else
			System.out.println("clone�����");
	}
	
}
class glass  {//implements loneable{
	private int weight = 2;
	private double radius = 3;
	final int s = 0;//��������������ʾ�ĳ�ʼ������
	
	/*public glass(int aWeight, int aRadius){
		this.weight = aWeight;
		this.radius = aRadius;
		
	}
	*/
	{
		System.out.println("xiaojingzukeai");
	}
	int getWeight(){
		return this.weight;
	}
	double getRadius(){
		return this.radius;
	}
	public glass clone() throws CloneNotSupportedException{//���뽫������Ȩ���ض���Ϊpublic
		glass cloned = (glass) super.clone();//��Ϊobject ��Ծ���������һ����֪����ֻ�ܽ���������п���
		return cloned;
		
	}
}
