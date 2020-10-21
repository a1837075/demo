package ioL2.itheima06;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
打印流的特有功能：
    自动换行 使用方法println()实现自动换行
    自动刷新 创建PrintWriter对象时启动自动刷新开关，并且使用println等三个方法可以实现自动刷新

 注意：创建FileWriter对象是boolean参数是是否追加
        而创建打印对象的boolean类型参数是是否自动刷新

 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //method();
        //创建打印流对象
        //PrintWriter pw=new PrintWriter("c.txt");
        PrintWriter pw=new PrintWriter(new FileWriter("c.txt"),true);

        pw.println("hello");

        //释放资源
        //pw.close();
    }

    private static void method() throws FileNotFoundException {
        //创建打印流对象
        PrintWriter pw=new PrintWriter("c.txt");

        //pw.write("hello");
        pw.println("hello");
        pw.println("world");
        pw.println("java");

        //释放资源
        pw.close();
    }
}
