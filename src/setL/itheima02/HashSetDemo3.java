package setL.itheima02;

import java.util.HashSet;

/**
 * @author dawnStamp
 * @date 2020/9/19 15:38
 */
public class HashSetDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Person> hs=new HashSet<Person>();
        //创建元素对象
        Person p=new Person("zhangsan",22);
        Person p2=new Person("lisi",22);
        Person p3=new Person("lisi",22);
        //添加元素对象
        hs.add(p);
        hs.add(p2);
        hs.add(p3);
        //遍历集合对象
        for(Person person : hs){
            System.out.println(person);
        }
    }
}
