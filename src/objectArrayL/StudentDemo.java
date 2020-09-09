package objectArrayL;

/**
 * @author dawnStamp
 * @date 2020/9/3 8:44
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student[] students =new Student[3];

        Student s1=new Student("曹操",40);
        Student s2=new Student("刘备",35);
        Student s3=new Student("孙权",30);

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int x=0;x<students.length;x++){
            Student s=students[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
