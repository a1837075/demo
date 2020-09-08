package ioL.src.com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 //close()和flush()方法的区别：
 //flush():刷新缓冲区。流对象可以再被使用
 //close():先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了
 */
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw=new FileWriter("d:\\a.txt");
        FileWriter fw=new FileWriter("a.txt");//相对路径

        fw.write("helloworld");
        fw.flush();
        fw.write("java");
        fw.flush();

        fw.close();


    }

}
