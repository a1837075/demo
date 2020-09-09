package objectL1.itheima_09;

/**
 * @author dawnStamp
 * @date 2020/9/1 13:57
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("林青霞");
        s.setAge(28);
        s.getAge();
        System.out.println(s.getName()+"---"+s.getAge());

        Student s2=new Student("林青霞",28);
        System.out.println(s2.getName()+"---"+s2.getAge());

    }
}
