package com.itheima_03;

/**
常见小问题：
 ArrayIndexOutOfBoundsException:数组索引越界异常

 NullPointerException:空指针异常
 产生原因：数组已经不再指向堆内存的数据了，你还使用数组名去访问元素
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        //System.out.println(arr[3]);

        arr =null;
        System.out.println(arr[1]);
    }
}
