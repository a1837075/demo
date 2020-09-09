package methodL.itheima_03;

/**
 * @author dawnStamp
 * @date 2020/8/30 15:38
 */
public class MethodDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int result=sum(a,b);
        System.out.println("result:"+result);

        int c=30;
        int result2=sum(a,b,c);
        System.out.println("result:"+result2);

    }
    //不能出现方法名相同，并且参数列表也相同的情况
//    public static int sum(int x,int y){
//        return x+y;
//    }

    public static float sum(float a,float b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
