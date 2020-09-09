package objectL1.itheima_03;

/**
 * @author dawnStamp
 * @date 2020/8/31 21:44
 */
public class PhoneDemo3 {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="OPPO";
        p.price=2999;
        p.color="白色";
        System.out.println(p.brand+"---"+p.price+"---"+p.color);

        Phone p2=p;
        p.brand="魅族";
        p.price=1999;
        p.color="蓝色";
        System.out.println(p.brand+"---"+p.price+"---"+p.color);
        System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);

    }
}
