package methodL.itheima_01;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/29 21:15
 */
public class MethodTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int x=sc.nextInt();
        System.out.println("请输入第二个数据：");
        int y=sc.nextInt();

        boolean b=compare(x,y);
        System.out.println("b:"+b);
    }

    /*
    比较两个数是否相等
    */
    public static boolean compare(int a,int b){
        if(a==b){
            return true;
        }else {
            return false;
        }
    }
}
