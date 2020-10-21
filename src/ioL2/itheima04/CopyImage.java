package ioL2.itheima04;

import java.io.*;

/**
分别使用字符流和字节流复制图片

 二进制文件只能使用字节流进行复制（使用windows自带记事本打开读不到的）
 文本文件的复制既可以使用字符流，也可以使用字节流

 */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        //method();

        //创建字节输入流对象
        FileInputStream fis=new FileInputStream("截图.png");
        //创建字节输出流对象
        FileOutputStream fos=new FileOutputStream("d:\\截图.png");
        //一次读写一个字节数组
        int len;//用于存储读到的字节个数
        byte[] bys=new byte[1024];
        while ((len=fis.read(bys)) !=-1){
            fos.write(bys,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
    }

    private static void method() throws IOException {
        //创建字符输入流对象
        FileReader fr=new FileReader("截图.png");
        //创建字符输出流对象
        FileWriter fw=new FileWriter("d:\\截图.png");

        //一次读写一个字符数组
        int len;
        char[] chs=new char[1024];
        while ((len =fr.read(chs))!=-1){
            fw.write(chs,0,len);
            fw.flush();
        }
        //释放资源
        fw.close();
        fr.close();
    }
}
