package ioL2.itheima09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
编码表：把计算机底层的二进制数据转换成我们能看懂的字符
        ASCII

        GB2312 ---GBK
        Unicode 所有的字符都占2个字符
        UTF-8   长度可变的码表

 ANSI:本地编码表 gbk
 Java中的字符串默认使用的ANSI (gbk)

乱码：编码保持前后一致即可解决

 */
public class EncoderDemo {
    public static void main(String[] args) throws IOException {
        //method();

        FileInputStream fis=new FileInputStream("a.txt");
        byte[] bys=new byte[1024];
        int len=fis.read(bys);
        //System.out.println(new String(bys,0,len));
        System.out.println(new String(bys,0,len,"UTF-8"));

    }

    private static void method() throws IOException {
        String s="高薪就业";
        //byte[] bys=s.getBytes();//通过默认编码转换成数据
        byte[] bys=s.getBytes("UTF-8");

        FileOutputStream fos=new FileOutputStream("a.txt");
        fos.write(bys);
        fos.close();
    }
}
