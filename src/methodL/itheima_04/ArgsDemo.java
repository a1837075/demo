package methodL.itheima_04;

import java.sql.SQLOutput;

/**
 * @author dawnStamp
 * @date 2020/8/30 15:55
 */
public class ArgsDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a:"+a+",b:"+b);
        change(a,b);
        System.out.println("a:"+a+",b:"+b);

    }
    public static void change(int a,int b){
        System.out.println("a:"+a+",b:"+b);
        a=b;
        b=a+b;
        System.out.println("a:"+a+",b:"+b);
    }


}
