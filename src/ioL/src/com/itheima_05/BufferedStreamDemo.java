package ioL.src.com.itheima_05;

import java.io.*;

/**
 * @author dawnStamp
 * @date 2020/9/6 12:10
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw=new BufferedWriter(new FileWriter("bw2.txt"));
        for (int x=0;x<10;x++){
            bw.write("hello"+x);
            //bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }
            bw.close();*/

        BufferedReader br=new BufferedReader(new FileReader("br.txt"));

        /*String line=br.readLine();
        System.out.println(line);

        line=br.readLine();
        System.out.println(line);

        line=br.readLine();
        System.out.println(line);*/

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
