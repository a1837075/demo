package arrayListL.itheima_03;

/**
 * @author dawnStamp
 * @date 2020/9/3 16:19
 */
public class Student {
    private String name;
    private String age;

    public Student() {
    }
    public Student(String name,String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
