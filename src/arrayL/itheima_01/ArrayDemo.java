package arrayL.itheima_01;
/**
 定义格式：
    A：数据类型[] 数组名;（推荐）
 int[] arr;定义了一个int类型的数组，数组名是arr
    B：数据类型 数组名[];
 int arr[];定义了一个int类型的变量，变量名是arr数组

数组初始化：
    有两种方式可以实现数组初始化
    a：动态初始化     只给出长度，有系统给出初始化值
    b：静态初始化     给出初始化值，由系统决定长度

 动态初始化：
    数据类型[] 数组名 =new 数据类型[数组长度]
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr=new int[3];

        //输出数组名
        System.out.println("arr:"+arr);
        //我们获取数组的地址值是没意义的，我要的是数组中的元素值
        //其实数组中的每个元素都是有编号的，编号从0开始，最大的编号是数组的长度-1
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
