package arrayListL.itheima_02;

import java.util.ArrayList;

/**
存储自定义对象并遍历

 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<Student>();

        Student s1=new Student("林青霞",28);
        Student s2=new Student("张曼玉",30);
        Student s3=new Student("景甜",25);
        Student s4=new Student("柳岩",18);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        for (int x=0;x<array.size();x++){
            Student s=array.get(x);
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
