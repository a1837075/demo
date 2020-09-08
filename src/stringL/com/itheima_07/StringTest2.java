package stringL.com.itheima_07;
import java.util.Scanner;

/**
字符串反转

 */
public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.nextLine();
        String result=reverse(s);
        System.out.println("result:"+result);

    }
    //第一种，把字符串遍历，得到的每一个字符拼接成字符串
    /*public static String reverse(String s){
        String ss="";
        for (int x=s.length()-1;x>=0;x--){
            ss +=s.charAt(x);
        }

        return ss;
    }*/

    //第二种，把字符串转换为字符数，然后对字符数组进行反转
    //最后把字符数组转换为字符串
    public static String reverse(String s) {
        char[] chs = s.toCharArray();
        for (int start = 0, end = chs.length - 1; start <= end; start++, end--) {
            char temp = chs[start];
            chs[start] = chs[end];
            chs[end] = temp;
        }
        String ss=new String(chs);
        return ss;
    }

}
