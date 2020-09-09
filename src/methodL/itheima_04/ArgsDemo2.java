package methodL.itheima_04;

/**
 * @author dawnStamp
 * @date 2020/8/30 16:06
 */
public class ArgsDemo2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
            System.out.println("----");
        }
        change(arr);
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    public static void change(int[] arr){
        for(int x=0;x<arr.length;x++){
            if(arr[x]%2==0){
                arr[x]*=2;
            }
        }
    }
}
