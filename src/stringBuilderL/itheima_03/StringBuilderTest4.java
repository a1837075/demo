package stringBuilderL.itheima_03;

import java.util.Scanner;

/**
判断一个字符串是否是对称字符串

 */
public class StringBuilderTest4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();

        boolean b=isSymmetry(s);
        System.out.println("b:"+b);
    }

    public static boolean isSymmetry(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String result=sb.toString();

        return  result.equals(s);

    }

}
