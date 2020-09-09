package objectL2.itheima03;

/**
 * @author dawnStamp
 * @date 2020/9/9 10:48
 */
public class MyArraysDemo {
    public static void main(String[] args) {
        int[] arr={3,5,8,10,1};
        int max=MyArrays.getMax(arr);
        System.out.println(max);

        int index=MyArrays.getIndex(arr,8);
        System.out.println(index);
    }
}
