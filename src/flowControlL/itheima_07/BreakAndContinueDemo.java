package flowControlL.itheima_07;

/**
break:结束整个循环
 continue：结束本次循环，继续下一次循环
 */
public class BreakAndContinueDemo {
    public static void main(String[] args) {
        for (int x=1;x<=10;x++){
            if (x%3==0){
                //break;
                continue;
            }
            System.out.println("hahah");
        }
    }
}
