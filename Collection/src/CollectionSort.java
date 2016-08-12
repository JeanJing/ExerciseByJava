import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
/**
 * 
 * <p>
 * ClassName CollectionsSort
 * </p>
 * <p>
 * Description ��Ҫ�������ּ��ϵ������㷨<br/>
 * ��һ��java.util.Collections.sort(java.util.List)��Ҫ��������Ԫ�ر���ʵ��java.lang.Comparable�ӿ� <br/>
 * �ڶ���java.util.Collections.sort(java.util.List, java.util.Comparator)���������Ҫ��ʵ��java.util.Comparator�ӿ� <br/>
 * ���������������ʹ�õ��Ƕ�int���������򣬶�String�����������ʹ�����·���<br/>
 * public int compareTo(Cat o){return this.getName().compareTo(o.getName(0);}<br/>
 * ���ģ�compareTo()������˵�� <br/>
 * ��� ���;<br/>
 * <0 a<b ;<br/>=
 * ==0 a==b;<br/>
 * >=0 a>b;
 * </p>
 * 
 * @author wangxu wangx89@126.com
 *     <p>
 *     Date 2014-9-16 ����04:52:57
 *     </p>
 * @version V1.0
 * 
 */
 
public class CollectionSort {
    public static void main(String[] args) {
        // method1();���Ե�һ������
        method2();// ���Եڶ�������
    }
 
    public static void method1() {
        List<Cat> list = new ArrayList<Cat>();
        Cat c = new Cat("a", 10);
        list.add(c);
        c = new Cat("b", 20);
        list.add(c);
        c = new Cat("c", 3);
        list.add(c);
        // �����������
        Collections.sort(list);
        System.out.println(list);
        // �����������
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
 
    public static void method2() {
        List<Cat> list = new ArrayList<Cat>();
        Cat c = new Cat("a", 10);
        list.add(c);
        c = new Cat("b", 20);
        list.add(c);
        c = new Cat("c", 3);
        list.add(c);
        Comparator<Cat> catComparator = new Cat();
        // �����������
        Collections.sort(list, catComparator);
        System.out.println(list);
        // �����������
        catComparator = Collections.reverseOrder(catComparator);
        Collections.sort(list, catComparator);
        System.out.println(list);
    }
}
 
class Cat implements Comparable<Cat>, Comparator<Cat> {
    private int age;
    private String name;
 
    public Cat() {
    }
 
    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }
 
    public int getAge() {
        return this.age;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    // ʵ����Comparable�ӿڣ���Ҫ��д�÷���
    @Override
    public int compareTo(Cat o) {
        // TODO Auto-generated method stub
        return this.age - o.age;
    }
 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "���֣�" + getName() + ",���䣺" + getAge();
    }
 
    // ʵ����Comparator�ӿڣ���Ҫ��д�÷���
    @Override
    public int compare(Cat o1, Cat o2) {
        // TODO Auto-generated method stub
        return o1.getAge() - o2.getAge();
    }
 
}