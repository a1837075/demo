package testL;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/31 16:17
 */
public class Test8 {
    public static void main(String[] args) {
        int[] arr={5,7,3,2,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被查询的数据：");
        int number=sc.nextInt();

        int index=getIndex(arr,number);
        System.out.println("index:"+index);
    }


    public static int getIndex(int[] arr,int value){
        for (int x=0;x<arr.length;x++){
            if (arr[x]==value){
                return x;
            }
        }
        return -1;
    }
}
