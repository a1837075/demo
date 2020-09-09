package flowControlL.itheima_07;

/**
 continue作用：
 结束一次循环，继续下一次的循环
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int x=1;x<=10;x++){
            if(x==3){
                continue;
            }
            System.out.println("HelloWorld");
        }
    }
}
