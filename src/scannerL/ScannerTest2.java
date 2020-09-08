package scannerL;
import java.util.Scanner;
/**
 * @author dawnStamp
 * @date 2020/8/27 21:17
 */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第一个数据");
        int a=sc.nextInt();

        System.out.println("请输入第二个数据");
        int b=sc.nextInt();

        //boolean flag=(a==b)?true:false;
        boolean flag=(a==b);
        System.out.println("flag:"+flag);
    }
}
