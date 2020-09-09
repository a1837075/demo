package methodL.itheima_05;

/**
 * @author dawnStamp
 * @date 2020/8/30 16:25
 */
public class MethodTest2 {
    public static void main(String[] args) {
        int[] arr={24,36,75,81};

        int max=getMax(arr);
        System.out.println("max:"+max);
    }

    public static int getMax(int[] arr){
        int max=arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }
}
