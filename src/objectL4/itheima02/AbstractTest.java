package objectL4.itheima02;

/**
基础班老师，就业班老师

 共性：
    属性：姓名 年龄 性别
    行为：讲课 唱歌

 */
public class AbstractTest {
    public static void main(String[] args) {
        BasicTeacher bt=new BasicTeacher();
        bt.name="风清扬";
        bt.teach();

        JobTeacher jt=new JobTeacher();
        jt.name="仓老师";
        jt.teach();
    }
}
abstract class Teacher{
    String name;//姓名
    int age;//年龄
    String gender;//性别

    //讲课
    public abstract void teach();
}
class BasicTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(name+"讲基础课程");
    }
}
class JobTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println(name+"讲就业班课程");
    }
}