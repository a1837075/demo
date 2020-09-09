package studentManagerIOL;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/9/7 16:18
 */
public class StudentManagerTest {
    public static void main(String[] args) throws IOException {

        //定义文件路径
        String fileName="students.txt";
        //为了让程序回到这里来，我们使用循环
        while (true){
            System.out.println("--------欢迎来到学习管理系统--------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");

            Scanner sc=new Scanner(System.in);
            String choiceString =sc.nextLine();
            //用switch语句可实现选择
            switch (choiceString){
                case "1":
                    //查看学生
                    findAllStudent(fileName);
                    break;
                case "2":
                    //添加学生
                    addStudent(fileName);
                    break;
                case "3":
                    //删除学生
                    deleteStudent(fileName);
                    break;
                case "4":
                    //修改学生
                    updateStudent(fileName);
                    break;
                case "5":
                    //退出
                    //break;
                    //System.out.println("谢谢你的使用");
                default:
                    System.out.println("谢谢你的使用");
                    System.exit(0);//JVM退出
                    break;
            }
        }
    }
    //从文件中读取数据到集合
    public static void readData(String fileName,ArrayList<Student> array) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br=new BufferedReader(new FileReader(fileName));

        String line;
        while ((line=br.readLine())!=null){
            String[] datas=line.split(",");
            Student s=new Student();
            s.setId(datas[0]);
            s.setName(datas[1]);
            s.setAge(datas[2]);
            s.setAddress(datas[3]);
            array.add(s);
        }
        br.close();
    }
    //把集合中的数据写入文件
    public static void writeData(String fileName,ArrayList<Student> array) throws IOException {
        //创建输出缓冲流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));

        for (int x=0;x<array.size();x++){
            Student s=array.get(x);
            StringBuilder sb=new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
    //修改学生
    public static void updateStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> array=new ArrayList<Student>();
        //从文件中把数据读取到集合中
        readData(fileName,array);

        //键盘录入，到集合中找是否有学生使用改学号,如果有就修改
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号");
        String id=sc.nextLine();

        //定义一个索引
        int index=-1;
        for (int x=0;x<array.size();x++){
            Student s=array.get(x);
            if (s.getId().equals(id)){
                index =x;
                break;
            }
        }
        if (index ==-1){
            System.out.println("不好意思，你要删除的学号对应的学生信息不存在");
        }else {
            System.out.println("请输入学生新姓名：");
            String name=sc.nextLine();
            System.out.println("请输入学生新年龄：");
            String age=sc.nextLine();
            System.out.println("请输入学生新居住地：");
            String address=sc.nextLine();

            Student s=new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            //修改集合中的学生对象
            array.set(index,s);
            //把集合中的数据重新写回到文件
            writeData(fileName,array);

            System.out.println("修改学生成功");
        }
    }

    //删除学生
    public static void deleteStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> array=new ArrayList<Student>();
        //从文件中把数据读取到集合中
        readData(fileName,array);

        //键盘录入，到集合中找是否有学生使用改学号，如果有就可以删除该学生
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号");
        String id=sc.nextLine();

        //必须给出学号不存在的时候的提示
        //定义一个索引
        int index=-1;
        //遍历集合
        for (int x=0;x<array.size();x++){
            Student s=array.get(x);
            //拿这个学生对象的学号和键盘录入的学号进行比较
            if (s.getId().equals(id)){
                index =x;
                break;
            }
        }
        if (index == -1){
            System.out.println("不好意思，你要删除的学号对应的学生信息不存在");
        }else {
            array.remove(index);
            //把集合中的数据重新写回到文件
            writeData(fileName,array);

            System.out.println("删除学生成功"+id);
        }
    }
    //添加学生
    public static void addStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> array=new ArrayList<Student>();
        //从文件中把数据读取到集合中
        readData(fileName,array);

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

        //把集合中的数据重新写回到文件
        writeData(fileName,array);

        System.out.println("添加学生成功");

    }

    //查看所有学生
    public static void findAllStudent(String fileName) throws IOException {
        //创建集合对象
        ArrayList<Student> array=new ArrayList<Student>();
        //从文件中把数据读取到集合中
        readData(fileName,array);

        //首先判断集合中是否有数据，如果没有数据，就输出提示，并让该方法不继续执行
        if (array.size()==0){
            System.out.println("不好意思，目前没有学生信息可供查询，请回去重新选择你的操作");
            return;
        }
        //\t其实就是一个tab键的位置
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        for (int x=0;x<array.size();x++){
            Student s=array.get(x);
            System.out.println(s.getId()+"\t\t"+s.getName()+
                    "\t\t"+s.getAge()+"\t\t"+s.getAddress());

        }
    }
}
