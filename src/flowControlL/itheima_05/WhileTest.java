package flowControlL.itheima_05;

/**

 */
public class WhileTest {
    public static void main(String[] args) {
        //求1-100之和
        /*int sum=0;
        int x=1;
        while (x<=100){
            sum +=x;
            x++;
        }
        System.out.println("sum:"+sum);*/
        int count=0;
        int x=100;

        while (x<1000){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai
            )==x){
                count ++;
                System.out.println("x:"+x);
            }
            x ++;
        }

        System.out.println("count:"+count);
    }
}
