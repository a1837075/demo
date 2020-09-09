package flowControlL.itheima_04;

/**
在控制台输出所有的“水仙花数”

 获取一个三位数的个位，十位，百位
    举例：比如153
    个位：153%10
    十位：153/10%10
    百位：153/10/10%10
    ....
 拿每一个数据的每个位上的数据立方和相加，然后和该数据本身进行比较
 如果相等，就说明是水仙花数，就打印在控制台
 */
public class ForTest4 {
    public static void main(String[] args) {
        for (int x=100;x<10000;x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            /*int qian=x/10/10/10%10;*/

            if((ge*ge*ge+shi*shi*shi+bai*bai*bai
            )==x){
                System.out.println(x);
            }
        }

    }
}
