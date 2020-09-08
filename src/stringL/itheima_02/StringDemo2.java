package stringL.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/9/1 20:55
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2="hello";

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);

        System.out.println("s1==s2:"+(s1==s2));//false

        String s3="hello";
        System.out.println("s1==s3:"+(s2==s3));

    }
}
