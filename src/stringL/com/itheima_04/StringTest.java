package stringL.com.itheima_04;

/**
遍历字符串
 */
public class StringTest {
    public static void main(String[] args) {
        String s="abcde";

        for (int x=0;x<5;x++){
            System.out.println(s.charAt(x));
        }

        for (int x=0;x<s.length();x++){
            System.out.println(s.charAt(x));
        }
    }
}
