package flowControlL.itheima_06;

/**
初始化语句;
 do{
    循环体语句；
    控制条件语句；
 }while（判断条件语句）;

 */
public class DoWhileDemo {
    public static void main(String[] args) {

        /*int x=1;
        do {
            System.out.println("HelloWorle");
            x++;
        }while (x<=10);*/

        int count=0;
        int x=100;
        do {
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai
            )==x){
                count ++;
                System.out.println("x:"+x);
            }

            x ++;
        }while (x<1000);
        System.out.println("count:"+count);
    }
}
