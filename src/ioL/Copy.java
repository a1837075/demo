package ioL;

import java.io.FileWriter;
import java.io.IOException;

/**
Filewriter:
 Filewriter(String fileName):传递一个文件名称
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("d:\\a.txt");

        fw.write("IO流你好");
        //数据没有直接写到文件，其实是写到了内存缓冲区
        fw.flush();

        //释放资源
        //通知系统释放和该文件相关的资源
        fw.close();

    }
}
