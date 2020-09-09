package randomL;

import java.util.Random;
import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/28 15:22
 */
public class RandomTest {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(100)+1;

        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个数据（1-100）：");
            int guessNumber=sc.nextInt();

            if(guessNumber > number){
                System.out.println("您猜的数："+guessNumber+"随机数为"+number+"大了");
            }else if(guessNumber<number){
                System.out.println("您猜的数："+guessNumber+"随机数为"+number+"小了");
            }else {
                System.out.println("猜中了"+guessNumber+"随机数为"+number);
                break;
            }
        }

    }
}
