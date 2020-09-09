package stringBuilderL.itheima_03;

/**
 StringBuilder和String的相互转换
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        /*StringBuilder sb=new StringBuilder();
        sb.append("hello").append("world");


        String s=sb.toString();
        System.out.println(s);*/

        String s="helloworld";
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb);
    }
}
