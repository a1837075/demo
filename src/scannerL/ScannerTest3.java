package scannerL;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Scanner;
/**
 * @author dawnStamp
 * @date 2020/8/27 21:22
 */
public class ScannerTest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a=sc.nextInt();

        System.out.println("请输入第二个数据");
        int b=sc.nextInt();

        System.out.println("请输入第三个数据");
        int c=sc.nextInt();

        int temp=(a>b)?a:b;
        int max=(temp>c)?temp:c;
        System.out.println("max："+max);
    }
}
