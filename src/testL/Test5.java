package testL;

/**
 * @author dawnStamp
 * @date 2020/8/31 10:23
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr={171,72,19,16,118,51,210,7,18};

        int sum=0;
        for(int x=0;x<arr.length;x++){
            if((arr[x]%10 !=7)&&(arr[x]/10%10 !=7)&&(arr[x]%2)==0){
                sum +=arr[x];
            }
        }
        System.out.println(sum);
    }
}
