package flowControlL.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/8/27 22:03
 */
public class IfDemo3 {
    public static void main(String[] args) {
        System.out.println("开始");

        int x=5;
        int y;

        if (x>=3){
            y=2*x+1;
        }else if (x>=-1 &&x<3){
            y=2*x;
        }else if (x<=-1){
            y=2*x-1;
        }else {
            y=0;
            System.out.println("不存在这样的x");
        }
        System.out.println("y:"+y);
    }
}
