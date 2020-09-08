package com.itheima_05;

/**
二维数组：其实就是元素为一维数组的数组

 定义格式：
    A：数据类型[][] 数组名;(推荐的方式)
    B:数据类型 数组名[][];
    C：数据类型[] 数组名[]

 初始化：
    A：动态初始化
        数据类型[][] 数组名=new 数据类型[m][n];
        m表示的是二维数组中一维数组的个数
        n表示的是一维数组中的元素个数
    B: 静态初始化
        数据类型[][] 数组名={(元素...),(元素...),(元素...),...}


 */
public class ArrayArrayDemo {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println("...");
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
    }
}
