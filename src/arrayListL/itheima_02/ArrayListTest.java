package arrayListL.itheima_02;

import java.util.ArrayList;

/**
存储字符串并遍历
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        array.add("像问天");
        array.add("刘整风");
        array.add("左冷峰");
        array.add("风清扬");

        for (int x=0;x<array.size();x++){
            String s=array.get(x);
            System.out.println(s);
        }
    }
}
