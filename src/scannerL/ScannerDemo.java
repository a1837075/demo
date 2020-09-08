package scannerL;
import java.util.Scanner;

/**
为了提高程序的灵活性，我们就把数据改进为键盘输入。
 如何Scanner获取键盘录入数据？
 使用步骤：
        A：导包
            import java.util.Scanner;
            在一个类中：package>import>class
        B：创建键盘录入对象
            Scanner sc=new Scanner(System.in);
        C:接收数据
            int i =sc.nextInt();
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数据");
        int i=sc.nextInt();

        System.out.println("i:"+i);
    }
}
