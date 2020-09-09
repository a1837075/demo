package objectL1.itheima_05;

import com.sun.org.apache.regexp.internal.RE;

import java.security.PrivateKey;

/**
 * @author dawnStamp
 * @date 2020/8/31 22:04
 */
public class Student {
    String name;
    //int age;
    private int age;

    public void setAge(int a){
        if(a<0||a>200){
            System.out.println("您输入的年龄有误");
        }else {
            age =a;
        }

    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("姓名是："+name+"，年龄是："+age);
    }

}
