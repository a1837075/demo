package testL;

/**
 * @author dawnStamp
 * @date 2020/8/31 10:08
 */
public class Test3 {
    public static void main(String[] args) {
        for (int x=10000;x<100000;x++){
            int ge=x%10;
            int shi=x/10%10;
            int qian=x/10/10/10%10;
            int wan=x/10/10/10/10%10;

            if((ge==wan)&&(qian==shi)){
                System.out.println(x);
            }
        }
    }
}
