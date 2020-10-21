package ioL2.itheima09;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
字符流中的编码

 字符流 = 字节流+编码

 */
public class EncoderDemo2 {
    public static void main(String[] args) throws IOException {
        //method();

        //OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("b.txt"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("b.txt"),"UTF-8");
        String s="把她娶回家";
        osw.write(s);

        osw.close();
    }

    private static void method() throws IOException {
        FileWriter fw=new FileWriter("b.txt");

        String s="月薪过万";
        byte[] bys=s.getBytes("UTF-8");

        //fw.write(s);
        fw.write(new String(bys));
        fw.close();
    }
}
