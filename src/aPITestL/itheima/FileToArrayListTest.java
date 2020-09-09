package aPITestL.itheima;

import java.io.*;
import java.util.ArrayList;

/**
 * @author dawnStamp
 * @date 2020/9/7 15:32
 */
public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("array.txt"));

        ArrayList<Student> array=new ArrayList<Student>();

        String line;
        while ((line=br.readLine())!=null){
            //分割字符串
            String[] strArray=line.split(",");
            //创建学生对象并赋值
            Student s=new Student();
            s.setId(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(strArray[2]);
            s.setAddress(strArray[3]);
            //把学生对象作为元素存储到集合
            array.add(s);

        }
        br.close();

        //遍历集合
        System.out.println("学号\t\t姓名\t年龄\t居住地");
        for (int x=0;x<array.size();x++){
            Student s=array.get(x);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }

    }
}
