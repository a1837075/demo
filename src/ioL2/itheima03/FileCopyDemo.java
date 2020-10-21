package ioL2.itheima03;

import java.io.*;

/**
使用字节流复制文本文件

 */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis=new FileInputStream("IODemo.java");
        //创建字节输出流对象
        FileOutputStream fos=new FileOutputStream("d:\\IODemo.java");

        //一次读写一个字节
        int len;
        while ((len=fis.read())!=-1){
            fos.write(len);
            fos.flush();
        }

        //一次读写一个字节数组
        /*int len;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes)) !=-1){
            fos.write(bytes,0,len);
        }*/

        //释放资源
        fos.close();
        fis.close();
    }
}
