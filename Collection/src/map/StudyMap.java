package map;
import java.util.*;
public class StudyMap {
	public static void main(String args[]){
	    //LinkedHashMapÿ��Ԫ�ض���һ��ָ��ָ����һ�������Ԫ��
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(3, "yan");
		map.put(2, "zhen");
		map.put(1, "jing");
		
		System.out.println(map);
		//Iterator it = map map����û�е�����
		/*
		 *����һ 
		 */
		System.out.println("��һ�ֱ���������for-each + .entrySet()");
		for(Map.Entry<Integer,String>pair:map.entrySet()){
			pair.setValue("jing");
			System.out.println(pair.getKey() + " "+pair.getValue());
		}
		/*
		 *������
		 */
		System.out.println("�ڶ��ֱ��������� .entrySet() + set�ĵ�����");
		Iterator<Map.Entry<Integer, String>> it  = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> entry = it.next();
			//����ͨ�����ص�set��entrySet keySet values������ɾ��ԭmap�е�Ԫ��
			it.remove();/////////
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		/*
		 *������
		 */
		System.out.println("�����ֱ��������� keySet()");
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet){
			System.out.println(key + " " + map.get(key));
		}
	    Collection<String> valueSet = map.values();//������ǿ������ת��
	    System.out.println(valueSet);
	    
	    
	    //ѧϰhashtable
	    Hashtable<String,Integer> table  = new Hashtable<String,Integer>();
	    
	    table.put("jing", 1);
	    Enumeration element = table.elements();//table.keys();
	    while(element.hasMoreElements()){
	    	System.out.println(element.nextElement());
	    	
	    }
	}
}
