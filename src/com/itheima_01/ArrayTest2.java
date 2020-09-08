package com.itheima_01;

/**
 * @author dawnStamp
 * @date 2020/8/29 15:52
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr=new int[2];
        int[] arr2=new int[3];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);


        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        arr[1] =100;

        arr2[0] =200;
        arr2[2] =300;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
