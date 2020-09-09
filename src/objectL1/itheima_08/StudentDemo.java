package objectL1.itheima_08;

/**
 * @author dawnStamp
 * @date 2020/9/1 13:33
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.show();

        Student s2=new Student("林青霞");
        s2.show();
        Student s3=new Student(28);
        s3.show();
        Student s4=new Student("林青霞",28);
        s4.show();

    }
}
