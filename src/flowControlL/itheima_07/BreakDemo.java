package flowControlL.itheima_07;

/**
break作用：用于结束循环
 */
public class BreakDemo {
    public static void main(String[] args) {

        for (int x=1;x<=10;x++){
            if(x==3){
                break;
            }
            System.out.println("HelloWorld");
        }
    }
}
