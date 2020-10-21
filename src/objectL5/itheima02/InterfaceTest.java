package objectL5.itheima02;

/**
    篮球运动员和教练
    乒乓球运动员和教练
    现在篮球运动员和教练要出国访问，需要学习英语
    分析出来那些是类，哪些是抽象类，哪些是接口

 */
public class InterfaceTest {
    public static void main(String[] args) {
        //创建篮球运动员对象
        BasketBallPlayer bbp=new BasketBallPlayer();
        bbp.name="姚明";
        bbp.age=35;
        bbp.gender="男";
        bbp.sleep();
        bbp.study();
        bbp.speak();
        System.out.println("-----");
        //创建乒乓球教练对象
        PingpangCoach ppc=new PingpangCoach();
        ppc.name="刘喷子";
        ppc.name="40";
        ppc.gender="男";
        ppc.sleep();
        ppc.teach();

    }
}
class Person{
    String name;//姓名
    int age;//年龄
    String gender;//性别
    //无参构造
    public Person(){}
    //有参构造
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

//运动员
abstract class Player extends Person{
    //学习
    public abstract void study();
}

//教练
abstract class Coach extends Person{
    //教
    public abstract void teach();
}
//学习说英语
interface SpeakEnglish{
    public abstract void speak();
}

//篮球运动员
class BasketBallPlayer extends Player implements SpeakEnglish{

    @Override
    public void study() {
        System.out.println("学扣篮");
    }
    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
//乒乓球运动员
class PingpangPlayer extends Player{

    @Override
    public void study() {
        System.out.println("学抽球");
    }
}
//篮球教练
class BasketBallCoach extends Coach implements SpeakEnglish{

    @Override
    public void teach() {
        System.out.println("教扣篮");
    }

    @Override
    public void speak() {
        System.out.println("学英语");
    }
}
//乒乓球教练
class PingpangCoach extends Coach{

    @Override
    public void teach() {
        System.out.println("教抽球");
    }
}

