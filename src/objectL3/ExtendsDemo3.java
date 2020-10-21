/*
package objectL3.itheima;

*/
/**
继承中成员变量的特点:
    子类只能获取父类非私有成员
    子父类中成员变量的名字不一样直接获取父类的成员变量
    子父类中成员变量名字是一样的获取的是子类的成员变量

 就近原则：谁离我近，我就用谁
        如果有局部变量就使用局部变量
        如果没有局部变量，有子类的成员变量就使用子类的成员变量
        如果没有局部变量和子类的成员变量，有父类的成员变量就使用父类的成员变量
        啥都没有，出错了

 super：可以获取父类的成员变量和成员方法，用法和this是相似的

 *//*

public class ExtendsDemo3 {
    public static void main(String[] args) {
        Kid k=new Kid();
        k.show();
    }
}
class Dad{
    String name="建霖";
}
class Kid extends Dad{
    String name="四重";

    public void show(){
        String name="五重";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
}*/
