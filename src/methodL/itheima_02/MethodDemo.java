package methodL.itheima_02;

/**
void修饰的方法只能单独调用
 */
public class MethodDemo {
    public static void main(String[] args) {
        //单独调用
        printHelloWorld();

        //输出调用
        //System.out.println(printHelloWorld());

        //赋值调用
        //void v=printHelloWorld();
    }

    public static void printHelloWorld(){
        for (int x=0;x<10;x++){
            System.out.println("HelloWorld");
        }
    }
}
