package objectL1.itheima_05;

/**
 * @author dawnStamp
 * @date 2020/8/31 22:05
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.show();

        s.name="林青霞";
        //s.age=28;
        //s.age=-28;
        s.setAge(28);
        s.show();
    }
}
