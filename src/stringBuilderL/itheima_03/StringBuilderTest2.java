package stringBuilderL.itheima_03;

/**
把数组拼接成一个字符串
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,};

        String s=arrayToString(arr);
        System.out.println("s:"+s);
    }

    public static String arrayToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int x=0;x<arr.length;x++){
            if (x==arr.length-1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]).append(",");
            }
        }
        sb.append("]");

        String result=sb.toString();
        return result;
    }
}
