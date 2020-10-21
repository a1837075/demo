package ioL2.itheima07;

import java.io.*;

/**
解决对实现序列号接口出现的黄色警告问题
 Exception in thread "main" java.io.InvalidClassException
当Serialization 运行时检测到某个类具有以下问题之一时，抛出异常
        当类的序列版本号与从流中读取的类描述符的版本号不匹配
        该类包含未知数据类型
        该类没有可访问的无参数构造方法

 */
public class ObjectOutputStreamDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //method();

        method2();

    }
    //读取对象
    private static void method2() throws IOException, ClassNotFoundException {
        //创建对象输入流的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c.txt"));
        //读取对象
        Object obj=ois.readObject();
        System.out.println(obj);
        //释放资源
        ois.close();
    }

    //写出学生对象
    private static void method() throws IOException {
        //创建对象输出流的对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c.txt"));
        //创建学生对象
        Student s=new Student("qzansq",22);
        //写出学生对象
        oos.writeObject(s);
        //释放资源
        oos.close();
    }
}
