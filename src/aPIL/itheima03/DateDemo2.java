package aPIL.itheima03;

import java.util.Date;

/**
Date的常用方法
    毫秒值---Date
        设置
        返回值void，参数long
        void setTime(long time)
        Date(long date)
    Date---毫秒值
        获取
        返回long，无参数
        long getTime()
 */
public class DateDemo2 {
    public static void main(String[] args) {
        Date d=new Date();//默认当前系统时间
        //d.setTime(1000*60*60*24*2);
        System.out.println(d.toLocaleString());
        System.out.println(d.getTime());

        d.setTime(1600250999908L);
        System.out.println(d.toLocaleString());

    }
}
