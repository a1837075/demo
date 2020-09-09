package testL;

/**
 * @author dawnStamp
 * @date 2020/8/31 10:14
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;

        for(int x=2;x<arr.length;x++){
            arr[x] =arr[x-1]+arr[x-2];
        }
        System.out.println("第二十个月的兔子的对数："+arr[19]);
    }
}
