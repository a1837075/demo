package testL;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/31 15:44
 */
public class Test7 {
    public static void main(String[] args) {
          int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int x=0;x<arr.length;x++){
            System.out.println("请输入"+(x+1)+"个元素值");
            int number=sc.nextInt();
            arr[x] =number;
        }
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.println(arr[x]+"]");
            }else {
                System.out.print(arr[x]+",");
            }
        }
    }

    public static void reverse(int[] arr){
        for(int start =0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
}
