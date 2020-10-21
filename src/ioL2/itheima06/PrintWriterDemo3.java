package ioL2.itheima06;

import java.io.*;

/**
使用打印流复制文本文件

 数据源 SystemInOutDemo.java   BufferedReader
 目的地 d:\\SystemInOutDemo.java   PrintWriter

 */
public class PrintWriterDemo3 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        BufferedReader br=new BufferedReader(new FileReader("SystemInOutDemo.java"));
        //创建输出流对象
        PrintWriter pw=new PrintWriter(new FileWriter("d:\\SystemInOutDemo.java"),true);

        String line;//用于存储读取到的每行数据
        while ((line=br.readLine())!=null){
            pw.println(line);
        }

        //释放资源
        pw.close();
        br.close();
    }
}
