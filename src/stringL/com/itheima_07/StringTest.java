package stringL.com.itheima_07;

/**
把数组中的数据按照指定格式拼接成一个字符串
 举例：int[] arr={1,2,3};
 输出结果：[1,2,3]

 */
public class StringTest {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        String s=arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr){
        String s="";
        s +="[";
        for (int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s +=arr[x];
            }else {
                s +=arr[x];
                s +=",";
            }
        }
        s +="]";
        return s;


    }
}
