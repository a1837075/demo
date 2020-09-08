package com.itheima_01;

/**
 * @author dawnStamp
 * @date 2020/8/29 15:57
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0] =100;
        arr[1] =200;
        arr[2] =300;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2=arr;
        arr2[0] =111;
        arr2[1] =222;
        arr2[2] =333;

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
