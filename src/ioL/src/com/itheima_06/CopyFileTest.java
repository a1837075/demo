package ioL.src.com.itheima_06;

import java.io.*;

/**
 * @author dawnStamp
 * @date 2020/9/6 15:46
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //method1("FileWriterDemo.java","Copy.java");

        String srcFileName = "FileWriterDemo.java";
        String destFileName ="Copy.java";

        method1(srcFileName,destFileName);
//        method2(srcFileName,destFileName);
//        method3(srcFileName,destFileName);
//        method4(srcFileName,destFileName);
//        method5(srcFileName,destFileName);

    }
    //缓冲流一次读写一个字符串
    public static void method5(String srcFileName,String destFileName) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(new FileReader(srcFileName));
        //创建输出缓冲流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter(destFileName));

        //一次读写一个字符串
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }

    //缓冲流一次读写一个字符数组
    public static void method4(String srcFileName,String destFileName) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(new FileReader(srcFileName));
        //创建输出缓冲流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter(destFileName));

        //一次读写一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();
    }

    //缓冲流一次读写一个字符
    public static void method3(String srcFileName,String destFileName) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(new FileReader(srcFileName));
        //创建输出缓冲流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter(destFileName));

        //一次读写一个字符
        int ch;
        while ((ch=br.read())!=-1){
              bw.write(ch);
        }
        bw.close();
        br.close();
    }

        //基本流一次读写一个字符数组
    public static void method2(String srcFileName,String destFileName) throws IOException {
        //创建输入流对象
        FileReader fr=new FileReader(srcFileName);
        //创建输出流对象
        FileWriter fw=new FileWriter(destFileName);

        char[] chs=new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        fw.close();
        fr.close();
    }

    //基本流一次读写一个字符
    public static void method1(String srcFileName,String destFileName) throws IOException {
        //创建输入流对象
        FileReader fr=new FileReader(srcFileName);
        //创建输出流对象
        FileWriter fw=new FileWriter(destFileName);

        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
