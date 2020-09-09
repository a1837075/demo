package methodL.itheima_01;

/**
方法的调用：（有明确返回值的方法调用）
    A:单独调用没有意义
    B:输出调用，有意义，但是不够好，因为我可能需要拿结果进行进一步操作
    C:赋值调用，推荐方式
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        //单独调用
        //sum(10,20);

        //输出调用
        //System.out.println(sum(10,20));

        //赋值调用
        int result=sum(10,20);
        //可以对result进行操作
        result +=10;
        System.out.println(result);
    }

    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
