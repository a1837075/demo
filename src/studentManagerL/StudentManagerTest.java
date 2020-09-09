package studentManagerL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/9/3 16:54
 */
public class StudentManagerTest {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array=new ArrayList<Student>();
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
                    findAllStudent(array);
                    break;
                case "2":
                    //添加学生
                    addStudent(array);
                    break;
                case "3":
                    //删除学生
                    deleteStudent(array);
                    break;
                case "4":
                    //修改学生
                    updateStudent(array);
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
    //修改学生
    public static void updateStudent(ArrayList<Student> array){
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
            System.out.println("修改学生成功");
        }
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> array){
        //键盘录入，到集合中找是否有学生使用改学号，如果有就可以删除该学生
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号");
        String id=sc.nextLine();

        //必须给出学号不存在的时候的提示
        //定义一个索引
        int index=-1;
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
            System.out.println("删除学生成功"+id);
        }
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

    //查看所有学生
    public static void findAllStudent(ArrayList<Student> array){
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
