
public class InitialTest {
	public static void main(String args[]) throws CloneNotSupportedException{
		glass cup = new glass();
		System.out.println(cup.getWeight());
		System.out.println(cup.getRadius());
		glass gl = new glass();
		glass gl2 = gl.clone();
		if(gl == gl2)
			System.out.println("clone是浅拷贝");
		else
			System.out.println("clone是深拷贝");
	}
	
}
class glass  {//implements loneable{
	private int weight = 2;
	private double radius = 3;
	final int s = 0;//必须在声明中显示的初始化变量
	
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
	public glass clone() throws CloneNotSupportedException{//必须将方法的权限重定义为public
		glass cloned = (glass) super.clone();//因为object 类对具体的类对象一无所知所以只能将各个域进行拷贝
		return cloned;
		
	}
}
