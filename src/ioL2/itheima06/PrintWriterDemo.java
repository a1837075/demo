package ioL2.itheima06;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
打印流：
    PrintStream
    PrintWriter
        可以自动换行，println()
        不能输出字节，但是可以输出其他任意类型
        通过某些配置，可以实现自动刷新(只有在调用println、printf、format才有用)
        也是包装类，不具备写出功能
        可以把字节输出流转换成字符输出流

 注意：只能输出不能输入

 */
public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流对象
        PrintWriter pw=new PrintWriter("b.txt");
        //写出数据
        pw.write("hello");
        pw.write("world");
        pw.write("java");
        //释放资源
        pw.close();
    }
}
