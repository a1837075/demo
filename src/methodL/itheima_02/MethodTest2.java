package methodL.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/8/30 15:31
 */
public class MethodTest2 {
    public static void main(String[] args) {
        printFlower(1000);
    }

    public static void printFlower(int n){
        for(int x=100;x<n;x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;

            if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==x){
                System.out.println(x);
            }
        }
    }
}
