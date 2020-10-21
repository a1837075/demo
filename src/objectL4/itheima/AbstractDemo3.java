package objectL4.itheima;

/**
抽象类得成员特点：
    成员变量
        可以有成员变量，可以有常量
    成员方法
        可以有抽象方法，可以有非抽象方法
    构造方法
        可以有构造方法得，需要对抽象类得成员变量进行初始化


 */
public class AbstractDemo3 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.barking();
    }
}
abstract class Animal{
    String name="狗";
    final int num=10;

    public Animal(){
        System.out.println("我是抽象类得构造方法");
    }
    public abstract void eat();

    public void run(){}
}
class Dog extends Animal{
    public void barking(){
        System.out.println(name);
        System.out.println(num);
    }

    @Override
    public void eat() {

    }
}