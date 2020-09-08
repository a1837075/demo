package stringL.com.itheima_04;

/**
String类的获取功能：
 int length():获取字符串的长度
 char charAt(int index):获取指定索引处的字符
 int indexOf(String str):获取str在字符串对象中第一次出现的索引
 String substring(int start):从start开始截取字符串
 String substring(int start,int end):从start开始，到end结束截取字符串，包括start不包括end

 */
public class StringDemo {
    public static void main(String[] args) {
        String s="helloworld";

        // int length():获取字符串的长度
        System.out.println(s.length());
        System.out.println("----");
        //char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("----");

        // int indexOf(String str):获取str在字符串对象中第一次出现的索引
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf("ak"));
        System.out.println("----");

        // String substring(int start):从start开始截取字符串
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("----");

        //String substring(int start,int end):从start开始，到end结束街区字符串
        System.out.println(s.substring(0,s.length()));
        System.out.println(s.substring(3,6));

    }
}
