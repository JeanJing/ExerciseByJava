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
 * Description 主要介绍两种集合的排序算法<br/>
 * 第一：java.util.Collections.sort(java.util.List)，要求所排序元素必须实现java.lang.Comparable接口 <br/>
 * 第二：java.util.Collections.sort(java.util.List, java.util.Comparator)，这个方法要求实现java.util.Comparator接口 <br/>
 * 第三：下面的例子使用的是对int型属性排序，对String属性排序可以使用以下方法<br/>
 * public int compareTo(Cat o){return this.getName().compareTo(o.getName(0);}<br/>
 * 第四：compareTo()函数的说明 <br/>
 * 如果 结果;<br/>
 * <0 a<b ;<br/>=
 * ==0 a==b;<br/>
 * >=0 a>b;
 * </p>
 * 
 * @author wangxu wangx89@126.com
 *     <p>
 *     Date 2014-9-16 下午04:52:57
 *     </p>
 * @version V1.0
 * 
 */
 
public class CollectionSort {
    public static void main(String[] args) {
        // method1();测试第一个方法
        method2();// 测试第二个方法
    }
 
    public static void method1() {
        List<Cat> list = new ArrayList<Cat>();
        Cat c = new Cat("a", 10);
        list.add(c);
        c = new Cat("b", 20);
        list.add(c);
        c = new Cat("c", 3);
        list.add(c);
        // 升序排列输出
        Collections.sort(list);
        System.out.println(list);
        // 降序排列输出
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
        // 升序排列输出
        Collections.sort(list, catComparator);
        System.out.println(list);
        // 降序排列输出
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
 
    // 实现了Comparable接口，不要重写该方法
    @Override
    public int compareTo(Cat o) {
        // TODO Auto-generated method stub
        return this.age - o.age;
    }
 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "名字：" + getName() + ",年龄：" + getAge();
    }
 
    // 实现了Comparator接口，需要重写该方法
    @Override
    public int compare(Cat o1, Cat o2) {
        // TODO Auto-generated method stub
        return o1.getAge() - o2.getAge();
    }
 
}