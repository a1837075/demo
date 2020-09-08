package ioL.src.com.itheima_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author dawnStamp
 * @date 2020/9/6 21:39
 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array=new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        BufferedWriter bw=new BufferedWriter(new FileWriter("array.txt"));

        for (int x=0;x<array.size();x++){
            String s=array.get(x);
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
