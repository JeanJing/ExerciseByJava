package map;
import java.util.*;
public class StudyMap {
	public static void main(String args[]){
	    //LinkedHashMap每个元素多了一个指针指向下一个插入的元素
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(3, "yan");
		map.put(2, "zhen");
		map.put(1, "jing");
		
		System.out.println(map);
		//Iterator it = map map本身没有迭代器
		/*
		 *遍历一 
		 */
		System.out.println("第一种遍历方法：for-each + .entrySet()");
		for(Map.Entry<Integer,String>pair:map.entrySet()){
			pair.setValue("jing");
			System.out.println(pair.getKey() + " "+pair.getValue());
		}
		/*
		 *遍历二
		 */
		System.out.println("第二种遍历方法： .entrySet() + set的迭代器");
		Iterator<Map.Entry<Integer, String>> it  = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> entry = it.next();
			//可以通过返回的set（entrySet keySet values）集合删除原map中的元素
			it.remove();/////////
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		/*
		 *遍历三
		 */
		System.out.println("第三种遍历方法： keySet()");
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet){
			System.out.println(key + " " + map.get(key));
		}
	    Collection<String> valueSet = map.values();//不可以强制类型转换
	    System.out.println(valueSet);
	    
	    
	    //学习hashtable
	    Hashtable<String,Integer> table  = new Hashtable<String,Integer>();
	    
	    table.put("jing", 1);
	    Enumeration element = table.elements();//table.keys();
	    while(element.hasMoreElements()){
	    	System.out.println(element.nextElement());
	    	
	    }
	}
}
