package methodL.itheima_05;

/**
 * @author dawnStamp
 * @date 2020/8/30 16:30
 */
public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=sum(arr);
        System.out.println("sum:"+sum);
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int x=0;x<arr.length;x++){
            sum +=arr[x];
        }
        return sum;
    }
}
