package aPITestL.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/9/6 22:02
 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<Student> array=new ArrayList<Student>();

        addStudent(array);
        addStudent(array);
        addStudent(array);

        //创建输出缓冲流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("array.txt"));
        //遍历集合，得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
        for (int x=0;x<array.size();x++){
            Student s=array.get(x);

            StringBuilder sb=new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress()).append(",");

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
            bw.close();
    }
    //添加学生
    public static void addStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        String id;
        //为了让代码能够回到这里，用循环
        while (true){
            System.out.println("请输入学生学号");
            id=sc.nextLine();

            //判断学号有没有被占用
            //定义标记
            boolean falg=false;
            for (int x=0;x<array.size();x++){
                Student s=array.get(x);

                if (s.getId().equals(id)){
                    falg =true;//说明学号被占用
                    break;
                }
            }
            if (falg){
                System.out.println("你输入的学号被占用，请重新输入");
            }else {
                break;//结束循环
            }
        }
        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地");
        String address=sc.nextLine();

        //创建学生对象
        Student s=new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //把学生对象作为元素添加到集合
        array.add(s);

        System.out.println("添加学生成功");

    }
}
