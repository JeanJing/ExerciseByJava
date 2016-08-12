import java.util.*;
public class TestList {
	public static void main(String []args){
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(4);
		//list.add(0);
	    //list.add(2);
		//Collections.sort(list);//数组有针对数组的排序，集合类有针对集合类的排序，分别放在Arrays类和Collections类的静态方法中
	    System.out.println(list);//从这里也可以看出来linkedlist把插入的数据重新排序了
		list.add(0);
	    list.add(2);//前面就是排好序的后面就不是了
	    System.out.println(list);
	    
	    Collections.reverse(list);//Collections里面的方法将集合类打乱
	    System.out.println(list);
	    
	    Collections.shuffle(list);//现在可以看到collection里面方法可以将集合类随机打乱
	    System.out.println(list);
	    //Integer[] data = (Integer[])list.toArray();//这种强制类型转换会有异常抛出
	 
	    Integer []data = list.toArray(new Integer[0]);//可以 创建一个长度为0的数组，从这里看是这样的，这里的参数仅仅是为了通过模板，使得返回值类型明确
	    System.out.println("data的第一个元素是"+data[0]);
	    List<Integer> list_2 = new LinkedList<Integer>();//看来必须是同一种类型的list才可以复制
	    
	    list_2.add(0);
	    list_2.add(1);
	    list_2.add(2);
	    list_2.add(3);
	    list_2.add(4);
	    list_2.add(5);
	    //list_2.add(6);
	    Collections.copy(list_2, list);//最最开始的时候，我仅仅定义一个LinkedList变量，无法复制，copy方法目标的长度必须是大于等于源列表长度的
	    System.out.println(list_2);
	    
	    System.out.println(list.contains(132));
	    
	}

}
