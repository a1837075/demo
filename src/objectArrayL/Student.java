package objectArrayL;

/**
 * @author dawnStamp
 * @date 2020/9/3 8:44
 */
public class Student {
    private String name;
    private int age;

    public Student(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
