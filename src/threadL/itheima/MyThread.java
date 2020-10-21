package threadL.itheima;

/**
 * @author dawnStamp
 * @date 2020/9/25 21:50
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
