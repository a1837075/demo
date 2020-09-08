package ioL.src.com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
\n可以实现换行，但是windows系统自带的记事本并没有换行
 windows系统识别的换行是\r\n
 linux:\n
 mac:\r
 */
public class FileWriterDemo4 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw=new FileWriter("c.txt");
        FileWriter fw=new FileWriter("c.txt",true);//表示追加写入，默认是false

        for (int x=0;x<10;x++){
            fw.write("hello"+x);
            fw.write("\r\n");
        }

        fw.close();
    }
}
