package methodL.itheima_01;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/29 21:20
 */
public class MethodTest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c=sc.nextInt();

        int max=getMax(a,b,c);
        System.out.println("getMax:"+max);
    }

    public static int getMax(int a,int b,int c){
        if (a>b){
            if (a>c){
                return a;
            }else {
                return c;
            }
        }else {
            if (b>c){
                return b;
            }else {
                return c;
            }
        }
    }
}
