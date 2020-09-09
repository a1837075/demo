package methodL.itheima_01;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/29 21:10
 */
public class MethodTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b=sc.nextInt();
        //调用方法
        int max=getMax(a,b);
        System.out.println("max:"+max);
    }

    /*
    * 返回两个数中的最大值
    */

    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
