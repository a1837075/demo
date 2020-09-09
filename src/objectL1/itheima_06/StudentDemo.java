package objectL1.itheima_06;

/**
 * @author dawnStamp
 * @date 2020/9/1 13:18
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();

        System.out.println(s.getName()+"---"+s.getAge());

        s.setName("林青霞");
        s.setAge(28);
        System.out.println(s.getName()+"---"+s.getAge());


    }
}
