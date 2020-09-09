package flowControlL.itheima_02;
import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/27 22:10
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第一个数据");
        int a=sc.nextInt();

        System.out.println("请输入第二个数据");
        int b=sc.nextInt();

       /* if(a>b){
            System.out.println("大的值是"+a);
        }else {
            System.out.println("大的值是"+b);
        }*/

        //两个数据比较后，我拿最大值可能需要做其他的操作
        int max;

        if(a>b){
            max=a;
        }else {
            max=b;
        }
        max +=1;
        System.out.println("大的值是"+max);
    }
}
