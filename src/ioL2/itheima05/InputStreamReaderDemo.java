package ioL2.itheima05;

import java.io.*;

/**
需求：读取键盘录入的数据，并输出到项目根目录下的a.txt文件中

 数据源：读取键盘录入的数据  System.in
 目的地：项目项目根目录下的a.txt     FileWriter

 转换流：需要把字节输入流转换成字符输入流，InputStreamReader
 InputStreamReader(InputStream in)

 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        InputStream is=System.in;
        Reader r=new InputStreamReader(is);
        //创建输出流对象
        FileWriter fw=new FileWriter("a.txt");

        //读写数据
        char[] chs=new char[1024];
        int len;
        while ((len=r.read(chs))!=-1){
            fw.write(chs,0,len);
            fw.flush();
        }
        //释放资源
        fw.close();
        is.close();

    }

    private static void method() throws IOException {
        //创建输入流对象
        InputStream is=System.in;

        //创建输出流对象
        FileWriter fw=new FileWriter("a.txt");

        //读写数据
        byte[] bys=new byte[1024];
        int len;//用于存储读取到的字节个数
        while ((len=is.read(bys))!=-1){
            fw.write(new String(bys));
            fw.flush();
        }
        //释放资源
        fw.close();
        is.close();
    }
}
