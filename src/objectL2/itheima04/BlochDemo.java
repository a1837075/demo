package objectL2.itheima04;

/**
 * @author dawnStamp
 * @date 2020/9/9 15:41
 */
public class BlochDemo {
    public static void main(String[] args) {
        //局部代码块：存在于方法中，控制变量的生命周期（作用域）
        /*{
            for (int x=0;x<10;x++){
                System.out.println("我哎");
            }
        }*/
        Teacher t=new Teacher();
        Teacher t2=new Teacher("老师",18);
    }
}
class Teacher{
    String name;
    int age;
//构造代码块：提取构造方法中的共性，每次创建对象都会执行，并且再构造方法执行之前都会执行
    {
        System.out.println("hello");
    }

//静态代码块：随着类的加载而加载，只加载一次，加载类时需要做的一些初始化，比如加载驱动
    static {
        System.out.println("helloworld");
    }
    public Teacher(){
        System.out.println("我是无参空构造");
    }

    public Teacher(String name, int age) {
        System.out.println("我是有参构造");
        this.name = name;
        this.age = age;
    }


}