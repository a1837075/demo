package com.itheima_05;

/**
二维数组的遍历
 */
public class ArrayArrayTest {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        //System.out.println(arr[0][0]);

        /*for (int x=0;x<arr[0].length;x++){
            System.out.println(arr[0][x]);
        }
        System.out.println("-----");*/

        for (int y=0;y<arr.length;y++){
            for (int x=0;x<arr[y].length;x++){
                System.out.print(arr[y][x]+" ");
            }
        }
        System.out.println();
        System.out.println("-------");
    }
}
