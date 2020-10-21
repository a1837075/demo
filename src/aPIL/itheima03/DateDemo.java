package aPIL.itheima03;

import java.util.Date;

/**
Date:表示特定的时间，精确到毫秒
 System.currentTimeMillis():返回的是当前系统时间，1970-1-1至今的毫秒数

 构造方法：Date():创建的是一个表示当前系统时间的Date对象
        Date(long date)：根据"指定时间"创建Date对象

 */
public class DateDemo {
    public static void main(String[] args) {
        //Date()
        Date d=new Date();
        //System.out.println(d);
        //System.out.println(d.toLocaleString());

        //Date(long date)
        Date d2=new Date(1000*60*60 *24);//时区 有时差
        System.out.println(d2.toLocaleString());
    }
}
