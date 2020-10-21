package threadL.itheima02;

/**
 * @author dawnStamp
 * @date 2020/9/25 22:29
 */
public class MyThread2 implements Runnable {
    int num;

    public MyThread2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            //Thread t=Thread.currentThread();
            //System.out.println(t.getName()+"="+i);

            //链式编程
            System.out.println(Thread.currentThread().getName()+":"+i+num);
        }
    }
}
