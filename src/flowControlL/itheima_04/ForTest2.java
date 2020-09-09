package flowControlL.itheima_04;

/**
求1-5之间数据之和

 分析：
 A:定义求和变量，初始化的值是0
 B：获取1-5的数据，
 C：把每一次获取到的数据累加到求和变量即可
 D：输出求和变量
 */
public class ForTest2 {
    public static void main(String[] args) {
        int sum=0;

        for (int x=1;x<=5;x++){
            //sum=sum+x;
            sum +=x;
        }
        System.out.println("sum:"+sum);
    }
}
