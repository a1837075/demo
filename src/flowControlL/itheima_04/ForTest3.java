package flowControlL.itheima_04;

/**
 * @author dawnStamp
 * @date 2020/8/28 11:09
 */
public class ForTest3 {
    public static void main(String[] args) {
        int sum=0;

        for(int x=1;x<=100;x++){
            if(x%2 ==0){
                sum +=x;
            }
        }
        System.out.println("sum:"+sum);
    }
}
