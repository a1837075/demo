package objectL1.itheima_02;

import java.sql.SQLOutput;

/**
 * @author dawnStamp
 * @date 2020/8/31 21:18
 */
public class Phone {
    String brand;
    int price;
    String color;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }

}
