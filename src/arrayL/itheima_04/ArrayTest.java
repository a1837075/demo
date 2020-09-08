package arrayL.itheima_04;

/**
数组遍历
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};

        //通过for循环获取数据0-4
        for(int x=0;x<5;x++){
            System.out.println(arr[x]);
        }
        System.out.println("....");

        //用于获取数组元素个数
        System.out.println("数组共有"+arr.length+"个");

        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }
}
