package ioL.src.com.itheima_05;

import java.io.*;


/**
 * @author dawnStamp
 * @date 2020/9/6 15:40
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(new FileReader("FileWriterDemo.java"));
        //创建输出缓冲流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("Copy.java"));

        //读写数据
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
