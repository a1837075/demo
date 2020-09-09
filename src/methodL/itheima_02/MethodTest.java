package methodL.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/8/30 15:28
 */
public class MethodTest {
    public static void main(String[] args) {
        printNumber(3);
        System.out.println("----");
        printNumber(10);
    }

    public static void printNumber(int n){
        for (int x=1;x<=n;x++){
            System.out.println(x);
        }
    }
}
