package stringBuilderL.itheima_01;

/**
StringBuilder:是一个可变的字符串

 String和StringBuilder的区别：
    String的内容是固定的。
    StringBuilder的内容是可变的。

 构造方法：
        StringBuilder()

 成员方法:public int capacity():返回当前容量
        public int length():返回长度(字符串)
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.capacity():"+sb.capacity());
        System.out.println("sb.length():"+sb.length());
    }


}
