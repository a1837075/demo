package arrayListL.itheima_01;

import java.util.ArrayList;

/**
 * @author dawnStamp
 * @date 2020/9/3 9:12
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array=new ArrayList<String>();

        //add(E e):添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //add(int index,E element):在指定的索引处添加一个元素
        //array.add(1,"adroid");

        System.out.println(array);
    }

}
