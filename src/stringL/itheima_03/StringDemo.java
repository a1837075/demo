package stringL.itheima_03;

/**
 * @author dawnStamp
 * @date 2020/9/1 21:33
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="Hello";

        //比较字符串的内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("-------");
        //比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("-------");

        //判断字符串对象是否以制定的he开头
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("ll"));
    }
}
