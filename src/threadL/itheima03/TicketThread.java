package threadL.itheima03;

/**
    要有多个线程
    要有被多个线程所共享的数据
    多个线程并发的访问共享的数据

 synchronizd：同步，可以修饰代码块和方法，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他的线程将无法访问

 同步代码块:
        synchronized(锁对象){

    }

 注意：锁对象需要被所有的线程所共享

 同步：安全性高，效率低
 非同步：效率高，但是安全性低

 同步方法：使用关键字synchronized修饰的方法，一旦被一个线程访问，则整个方法全部锁住，其他线程则无法访问

 synchronized
 注意：
     非静态同步方法的锁对象是this
     静态同步方法的锁对象是当前类的字节码对象

 */
public class TicketThread<synchronizd> implements Runnable{
    static int ticket=100;//火车票数量
    Object obj=new Object();

    @Override
    public void run() {
        //出售火车票
        while (true){
            /*synchronized (obj){
                method();
            }*/
            method2();
        }
    }

    private synchronized void method() {
        //当火车票小于0张，则停止售票
        if(ticket >0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+ticket--);
        }
    }

    private static synchronized void method2() {

        //当火车票小于0张，则停止售票
        if(ticket >0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+ticket--);
        }
    }
}
