package stringL.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/9/1 20:44
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1=new String("hello");
        System.out.println("s1:"+s1);

        char[] chs={'h','e','l','l','o'};
        String s2=new String(chs);
        System.out.println("s2:"+s2);
        System.out.println("-----");

        //String s3=new String(chs,0,chs.length);
        String s3=new String(chs,1,3);
        System.out.println("s3:"+s3);

        String s4="hello";
        System.out.println("s4:"+s4);
    }
}
