package ioL.src.com.itheima_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dawnStamp
 * @date 2020/9/4 16:44
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("fr2.txt");
        FileReader fr=new FileReader("FileWriterDemo.java");

        /*
        char[] chs=new char[5];
        //第一次读取数据
        int len=fr.read(chs);
        System.out.println("len:"+len);
        //System.out.println(new String(chs));
        System.out.println(new String(chs,0,len));

        //第二次读取数据
        len=fr.read(chs);
        System.out.println("len:"+len);
        //System.out.println(new String(chs));
        System.out.println(new String(chs,0,len));

        //第三次读取数据
        len=fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs,0,len));

        len=fr.read(chs);
        System.out.println("len:"+len);
        len=fr.read(chs);
        System.out.println("len:"+len);
        */
        //char[] chs=new char[5];
        char[] chs=new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            System.out.print(new String(chs,0,len));

        }
        //释放资源
        fr.close();
    }
}
