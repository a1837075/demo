package ioL.src.com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dawnStamp
 * @date 2020/9/4 15:45
 */
public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("b.txt");

        //fw.write("abcde");

        //fw.write("abcde",1,4);

        /*fw.write('a');
        fw.write(97);*/

        /*char[] chs={'a','b','c','d','e'};
        fw.write(chs);*/

        char[] chs={'a','b','c','d','e'};
        fw.write(chs,1,4);
        fw.close();
    }
}
