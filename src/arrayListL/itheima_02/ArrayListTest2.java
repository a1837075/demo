package arrayListL.itheima_02;

import java.util.ArrayList;

/**
 * @author dawnStamp
 * @date 2020/9/3 9:45
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        String[] strArray ={"张三丰","宋远桥","张无忌",
                "殷梨亭","张春生","陌生古"};
        ArrayList<String> array=new ArrayList<String>();

        //遍历字符串数组，获取到每一个字符串元素
        for (int x=0;x<strArray.length;x++){
            array.add(strArray[x]);
        }

        //遍历集合
        for (int x=0;x< array.size();x++){
            String s=array.get(x);
            if (s.startsWith("张")){
                System.out.println(s);
            }
        }
    }
}
