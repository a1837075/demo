package aPIL.itheima02;

/**
System:包含一些有用的类字段和方法，它不能实例化
 static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 static long currentTimeMillis()
 static void exit(int status)
 static void gc()

 */
public class SystemDemo {
    public static void main(String[] args) {
        //method();
        //method2();
        //method3();

        //static void gc()
        new Demo();
        System.gc();
    }

    private static void method3() {
        //static void exit(int status):终止运行的java虚拟机
        for (int i=0;i<100000;i++){
            System.out.println(i);
            if (i==100){
                System.exit(0);
            }
        }
    }

    private static void method2() {
    /*static long currentTimeMillis()：以毫秒值返回单曲系统时间
    这个毫秒的时间是相对时间，相当于1970-1-1 00:00:00：0
    1970-1-1 00:00:01：1000
    1970-1-1 00:01:00：1000*60
    1970-1-1 01:00:00：1000*60*60
    1000毫秒=1秒

    */
        //System.out.println(System.currentTimeMillis());
        long start=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void method() {
    /*static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
    复制数组
    参数1：源数组
    参数2：源数组的起始索引位置
    参数3：目标数组
    参数4：目标数组的起始索引位置
    参数5：指定接收的元素的个数
    */
        int[] src={1,2,3,4,5};
        int[] dest=new int[5];
        System.arraycopy(src,2,dest,2,3);

        for (int i=0;i<dest.length;i++){
            System.out.print(dest[i]);
        }
    }

}

class Demo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了");
    }
}