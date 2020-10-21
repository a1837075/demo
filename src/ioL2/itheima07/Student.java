package ioL2.itheima07;

import java.io.Serializable;

/**
 * @author dawnStamp
 * @date 2020/9/24 21:30
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -7258765785801376967L;
    String name;
    int age;
    String gender;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
