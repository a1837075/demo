package stringBuilderL.itheima_02;

/**
 * @author dawnStamp
 * @date 2020/9/2 20:13
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        //public StringBuilder append(任意类型):添加数据，并返回自身对象
        StringBuilder sb2=sb.append("hello");

//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);
//        System.out.println(sb==sb2);//true

/*        sb.append("hello");
        sb.append("world");
        sb.append(true);
        sb.append(100);*/

        //链式编程
        sb.append("hello").append("world").append(true).append(100);

        System.out.println("sb:"+sb);

        //反转功能
        sb.reverse();
        System.out.println("sb:"+sb);
    }
}
