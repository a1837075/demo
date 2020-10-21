package objectL4.itheima02;

/**
足疗店
    技师
        足疗技师
        其他技师
    共性
        属性：姓名 年龄
        行为：服务
 */
public class AbstractTest3 {
    public static void main(String[] args) {
        足疗技师 zl=new 足疗技师();
        zl.service();

        其他技师 qt=new 其他技师();
        qt.service();
    }
}
abstract class 技师{
    String name;
    int age;

    //服务
    public abstract void service();
}

class 足疗技师 extends 技师{

    @Override
    public void service() {
        System.out.println("按脚揉肩");
    }
}
class 其他技师 extends 技师{

    @Override
    public void service() {
        System.out.println("你懂得");
    }
}