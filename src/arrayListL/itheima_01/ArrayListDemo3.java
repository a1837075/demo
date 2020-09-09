package arrayListL.itheima_01;

import java.util.ArrayList;

/**
ArrayList集合的遍历

 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println("----");

        for (int x=0;x<3;x++){
            System.out.println(array.get(x));
        }
        System.out.println("----");
        for (int x=0;x<array.size();x++){
            System.out.println(array.get(x));
        }
        System.out.println("----");

        //最标准的用法
        for (int x=0;x<array.size();x++){
            String s=array.get(x);
            System.out.println(s);
        }
    }
}
