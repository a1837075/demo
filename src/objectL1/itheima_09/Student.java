package objectL1.itheima_09;

/**
 * @author dawnStamp
 * @date 2020/9/1 13:57
 */
public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
