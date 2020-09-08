package ioL.src.com.itheima_04;

import java.io.*;

/**
 * @author dawnStamp
 * @date 2020/9/4 23:17
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建输出缓冲流对象
        /*BufferedWriter bw=new BufferedWriter(new FileWriter("bw.txt"));
        bw.write("hello");
        bw.flush();
        bw.close();*/

        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(new FileReader("FileWriterDemo.java"));

        //一次读写一个字符
        /*int ch;
        while ((ch=br.read())!=-1){
            System.out.print((char)ch);
        }*/

        //一次读写一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        br.close();
    }

}
