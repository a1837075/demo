package stringL.com.itheima_04;

import java.util.Scanner;

/**
统计一个此字符串大写字母，小写字母，数字字符出现的次数。(不考虑其他字符)
 */
public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串数据");
        String s=sc.nextLine();

        int bigCount =0;
        int smallCount =0;
        int numberCount = 0;

        for (int x=0;x<s.length();x++){
            char ch=s.charAt(x);
            //拿字符串进行判断
            if (ch>='A' && ch<='Z'){
                bigCount++;
            }else if (ch>='a' && ch<='z'){
                smallCount++;
            }else if (ch>='0' && ch<='9'){
                numberCount++;
            }else {
                System.out.println("该字符"+ch+"非法");
            }
        }
        System.out.println("大写字符："+bigCount+"个");
        System.out.println("小写字符："+smallCount+"个");
        System.out.println("数字字符："+numberCount+"个");

    }
}
