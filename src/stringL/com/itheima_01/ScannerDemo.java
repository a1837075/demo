package stringL.com.itheima_01;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/9/1 15:33
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个字符串数据：");
        String s=sc.nextLine();

        System.out.println("s:"+s);
    }

}
