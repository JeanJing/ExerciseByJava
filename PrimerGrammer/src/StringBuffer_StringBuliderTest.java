//StringBuffer和StringBuilder都是在lang库里面
public class StringBuffer_StringBuliderTest {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("zuotianyoumengjianchenleqishiwobuyinggaigeitafaduanxinde");//参数还可以是一个string
		System.out.println(sb.append("jingzhenayn"));
		sb.delete(20, 30);
		System.out.println(sb);
		sb.insert(1, 1.222);
		System.out.println(sb);//插入到偏移量位置，原先的部分整体往后移动
		sb.reverse();
		System.out.println(sb);//StringBuilder提供的方法要比String多一些
		sb.setCharAt(0,'N');
		System.out.println(sb);
		sb.replace(0, 4, "chen");
		System.out.println(sb);
		System.out.println("capacity:" + sb.capacity());
		System.out.println("length:" + sb.length());//容量会比长度大一点
	    Class cla = StringBuilder.class;
	    
	    System.out.println();
	}

}