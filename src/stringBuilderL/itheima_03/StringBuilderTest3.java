package stringBuilderL.itheima_03;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/9/2 21:21
 */
public class StringBuilderTest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();

        String result=myReverse(s);
        System.out.println("result:"+result);
    }

    public static String myReverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String result=sb.toString();
        return result;
    }
}
