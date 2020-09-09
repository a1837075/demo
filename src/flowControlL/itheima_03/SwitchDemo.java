package flowControlL.itheima_03;

import java.util.Scanner;

/**
switch(表达式){
        case 值1;
            语句体1;
            break;
        case 值2;
            语句体2;
            break;
        ...
        default:
            语句体n+1;
            break;
 }

 执行流程：  A：首先计算表达式的值
 B：拿着这个歌计算出的值，依次和case后面的值进行比较，
 一旦有匹配的，就执行对应的语句体，在执行过程中，遇到break就结束
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个数字（1-7）：");
        int weekday =sc.nextInt();

        switch (weekday){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("您输入的数据有误");
                break;
        }
    }
}
