package objectL1.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/8/31 21:09
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        //System.out.println("s:"+s);

        System.out.println("姓名："+s.name);
        System.out.println("姓名："+s.age);
        System.out.println("-------");

        s.name="林青霞";
        s.age=28;
        System.out.println("姓名："+s.name);
        System.out.println("姓名："+s.age);
        System.out.println("-------");

        s.study();
        s.eat();
    }
}
