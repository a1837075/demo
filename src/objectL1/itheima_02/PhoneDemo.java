package objectL1.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/8/31 21:22
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();

        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.println("------");

        p.brand="锤子";
        p.price=2999;
        p.color="棕色";

        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.println("------");

        p.call("林青霞");
        p.sendMessage();
    }
}
