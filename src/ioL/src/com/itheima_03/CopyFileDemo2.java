package ioL.src.com.itheima_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dawnStamp
 * @date 2020/9/4 22:56
 */
public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fr=new FileReader("FileWriterDemo.java");
        //创建输出流对象
        FileWriter fw=new FileWriter("Copy.java");

        char[] chs=new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        //释放资源
        fw.close();
        fr.close();

    }
}
