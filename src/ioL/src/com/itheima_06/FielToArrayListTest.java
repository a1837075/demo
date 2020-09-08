package ioL.src.com.itheima_06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author dawnStamp
 * @date 2020/9/6 21:54
 */
public class FielToArrayListTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("array.txt")) ;

        ArrayList<String> array=new ArrayList<String>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();

        for (int x=0;x<array.size();x++){
            String s=array.get(x);
            System.out.println(s);
        }
    }
}
