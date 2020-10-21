package ioL2.itheima07;

import java.io.*;

/**
使用对象输出流和读对象输入流写对象
 Exception in thread "main" java.io.NotSerializableException: ioL2.itheima07.Student
 Serializable:序列号，是一个标识接口，只起标识作用，没有方法
            当一个类的对象需要IO流进行读写的时候，这个类必须实现该接口

 Exception in thread "main" java.io.EOFException :当输入过程中意外达到文件或流的末尾时，抛出此异常


 */
public class ObjectOutputStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //method();
        //创建对象输入流的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        //读取对象
        /*Object obj=ois.readObject();
        System.out.println(obj);

        Object obj2=ois.readObject();
        System.out.println(obj2);

        Object obj3=ois.readObject();
        System.out.println(obj3);*/

        try {
            while (true){
                Object obj=ois.readObject();
                System.out.println(obj);
            }
        }catch (EOFException e){
            System.out.println("读到了文件的末尾");
        }
        //释放资源
    }

    private static void method() throws IOException {
        //创建对象输出流的对象
        //FileOutputStream fos=new FileOutputStream("a.txt");
        //ObjectOutputStream oos=new ObjectOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));

        //创建学生对象
        Student s=new Student("zhangsan",19);
        Student s2=new Student("lisi",22);
        //写出学生对象
        oos.writeObject(s);
        oos.writeObject(s2);

        //释放资源
        oos.close();
    }
}
