package aPIL.itheima;

import java.util.ArrayList;
import java.util.Objects;

/**
 boolean equals(Object obj)
    使用==来比较两个对象是否相等，则比较地址值是否相等

 */
public class ObjectDemo2 {
    public static void main(String[] args) {
        Person p=new Person("张三",19);
        Person p2=new Person("张三",19);

        //boolean flag=p.equals(p2);
        boolean flag=p.equals(new ArrayList());
        System.out.println(flag);

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

/*@Override
    public boolean equals(Object o){

        //提高效率 当前对象和传递进来的对象地址值是一样，则不用比较
        if (this == o){
            return true;
        }

        //提高代码的健壮性
        if (this.getClass() != o.getClass()){
            return false;
        }

        //向下转型
        Person other=(Person) o;

        if(!this.name.equals(other.name)){
            return false;
        }
        if (this.age !=other.age){
            return false;
        }
        return true;
    }*/

}