package aPIL.itheima04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 SimpleDateFormat:
    格式化：
        Date---String
       2020-9-16    2020年9月16日
        String format(Date date)
    解析：
        String---Date
        "2020-9-16"
        Date perse(String source)

 构造方法：
 SimpleDateFormat():使用默认的模式进行对象的构建
 SimpleDateFormat(String pattern):使用指定的模式进行对象的构建

注意：解析的字符串，模式必须和构建对象的模式一样


 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //method();
        //method2();
        //使用指定的模式进行对象的构建
        //1999年9月1日 10:10:10
        //yyyy年MM月dd日
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //格式化
        Date date=new Date();
        String s=sdf.format(date);
        System.out.println(s);//2020年09月16日 20:14:06

        //解析
        Date d=sdf.parse("2020年09月16日 20:14:06");
        System.out.println(d.toLocaleString());
    }

    private static void method2() throws ParseException {
        //使用指定的模式进行对象的构建
        //1999年9月1日
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        //格式化
        Date date=new Date();
        String s=sdf.format(date);
        System.out.println(s);//2020年09月16日

        //解析
        Date d=sdf.parse("2020年09月16日");
        System.out.println(d.toLocaleString());
    }

    private static void method() throws ParseException {
        //使用默认的模式进行对象的构建
        SimpleDateFormat sdf=new SimpleDateFormat();
        //创建日期对象
        Date date=new Date();

        //格式化 把日期对象转换成字符串
        String s=sdf.format(date);
        System.out.println(s);

        //解析 把字符串转换成日期对象
        Date d=sdf.parse("20-9-16 下午8:03");
        System.out.println(d.toLocaleString());
    }
}
