package ioL2.itheima05;

import java.io.*;

/**
需求：读取项目根目录下的SystemInputDemo.java ，并输出到命令行

 数据源：项目根目录下的SystemInputDemo.java  BufferedReader
 目的地：命令行    System.out

 由于标准输出流是一个字节输出流，所以只能输出字节或者字节数组，但是我们读取到的数据则是字符串，如果想进行输出还需要转换成字节数组
 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可，OutputStreamWriter

 OutputStreamWriter(OutputStream out)


 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //method2();

        //创建输入流对象
        BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
        //创建输出流对象
        //OutputStream os=System.out;
        //Writer w=new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象
        //BufferedWriter bw=new BufferedWriter(w);

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        //进行数据的读写
        String line;//由于存储读取到的数据
        while ((line =br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        //释放资源
        bw.close();
        br.close();
    }

    private static void method2() throws IOException {
        //创建输入流对象
        BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
        //创建输出流对象
        //OutputStream os=System.out;
        Writer w=new OutputStreamWriter(System.out);//多态，父类型引用指向子类对象

        //进行数据的读写
        String line;//由于存储读取到的数据
        while ((line =br.readLine())!=null){
            w.write(line);
            w.write("\r\n");
        }
        //释放资源
        w.close();
        br.close();
    }

    private static void method() throws IOException {
        //创建输入流对象
        BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
        //创建输出流对象
        OutputStream os=System.out;

        String line;//用于存储读取到的数据
        while ((line=br.readLine())!=null){
            os.write(line.getBytes());
            os.write("\r\n".getBytes());
        }

        //释放资源
        os.close();
        br.close();
    }
}
