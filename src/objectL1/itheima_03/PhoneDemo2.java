package objectL1.itheima_03;

/**
 * @author dawnStamp
 * @date 2020/8/31 21:39
 */
public class PhoneDemo2 {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米5S";
        p.price=1999;
        p.color="银色";
        System.out.println(p.brand+"---"+p.price+"---"+p.color);
        p.call("林青霞");
        p.sendMessage();

        Phone p2=new Phone();
        p2.brand="IPhone7S";
        p2.price=7999;
        p2.color="土豪金";
        System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);
        p2.call("张曼玉");
        p2.sendMessage();
    }
}
