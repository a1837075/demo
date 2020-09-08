package stringL.itheima_06;

/**
 * @author dawnStamp
 * @date 2020/9/2 14:19
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1="helloworld";
        String s2=" helloworld";
        String s3=" helloworld ";
        System.out.println("---"+s1+"---");
        System.out.println("---"+s1.trim()+"---");
        System.out.println("---"+s2+"---");
        System.out.println("---"+s2.trim()+"---");
        System.out.println("---"+s3+"---");
        System.out.println("---"+s3.trim()+"---");
        System.out.println("-----");

        //按照指定的符号分割字符串
        String s4="aa,bb,cc";
        String[] strArray=s4.split(",");
        for (int x=0;x<strArray.length;x++){
            System.out.println(strArray[x]);
        }

    }
}
