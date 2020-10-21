package objectL6.anonymousObject;

/**
匿名对象：没有名字的对象
匿名对象的应用场景：
    当方法只调用一次的时候就可以使用匿名对象
    可以当作参数进行传递，但是无法在传参之前做其他的事情

 注意：匿名对象可以调用成员变量并赋值，但是赋值并没有意义

 */
public class AnonymousObjectDemo {
    public static void main(String[] args) {
        //new Student();//匿名对象，没有变量引用的对象
//        new Student().study();
//        new Student().study();
//        new Student().study();

        /*new Student().age=18;
        System.out.println(new Student().age);*/

        method(new Student());

    }
    public static void method(Student s){

    }
}

class Student{
    String naem;
    int age;

    public void study(){
        System.out.println("好好学习");
    }
}