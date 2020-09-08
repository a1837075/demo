package com.itheima_04;

/**
获取数组最值
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr={12,45,98,73,60};

        //定义参照物
        int max=arr[0];

        //遍历数组，获取除了0索引以外的元素，进行比较
        for(int x=1;x<arr.length;x++){
            if (arr[x] > max){
                max=arr[x];
            }
        }
        System.out.println("max:"+max);
    }
}
