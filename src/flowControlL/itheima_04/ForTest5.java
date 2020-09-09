package flowControlL.itheima_04;

/**
统计水仙花数共有几个？
 分析：
 A：定义统计变量，初始化值是0
 B：
 */
public class ForTest5 {
    public static void main(String[] args) {
        int count=0;

        for(int x=100;x<1000;x++){
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;

            if((ge*ge*ge+shi*shi*shi+bai*bai*bai
            )==x){
                count ++;
                System.out.println(x);
            }
        }
        System.out.println("count:"+count);
    }
}
