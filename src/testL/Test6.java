package testL;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/31 11:47
 */
public class Test6 {
    public static void main(String[] args) {
         int[] arr=new int[6];

         Scanner sc=new Scanner(System.in);
        for(int x=0;x<arr.length;x++){
            System.out.println("请输入第"+(x+1)+"个评委的分数（0-100）");
            int score=sc.nextInt();
            if((score>=0)&&(score<=100)){
                arr[x] =score;
            }else {
                System.out.println("您输入的分数有误");
            }

        }
        int max=getMax(arr);
        int min=getMin(arr);
        int sum=sum(arr);

        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("该选手的平均分是："+avg);
    }

    public static int sum(int[] arr){
        int sum=0;
        for(int x=0;x<arr.length;x++){
            sum +=arr[x];
        }
        return sum;
    }
    public static int getMin(int[] arr){
        int min=arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x]<min){
                min =arr[x];
            }
        }
        return min;
    }

    public static int getMax(int[] arr){
        int max=arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max =arr[x];
            }
        }
        return max;
    }
}
