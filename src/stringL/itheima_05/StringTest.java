package stringL.itheima_05;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/9/2 14:15
 */
public class StringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();

        String s1=s.substring(0,1);

        String s2=s.substring(1);

        String s3=s1.toUpperCase()+s2.toLowerCase();
        System.out.println(s3);

    }
}
