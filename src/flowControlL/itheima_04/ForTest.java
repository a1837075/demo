package flowControlL.itheima_04;

/**
获取数据1-5和5-1
 */
public class ForTest {
    public static void main(String[] args) {
        for(int x=1;x<=5;x++){
            System.out.println(x);
        }
        System.out.println("------");
        for(int x=5;x>=1;x--){
            System.out.println(x);
        }
    }
}
