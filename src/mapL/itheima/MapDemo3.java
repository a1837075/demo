package mapL.itheima;

import java.util.*;

/**
Set<K> KeySet()
 Collection<V> values()
 */
public class MapDemo3 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map=new HashMap<String,String>();
        //添加映射关系
        map.put("ITCAST001","zhangsan");
        map.put("ITCAST002","lisi");
        map.put("ITCAST003","wangwu");

        //method(map);

        // Collection<V> values()
        Collection<String> values=map.values();
        for (String value: values) {
            System.out.println(value);
        }
    }

    private static void method(Map<String, String> map) {
        //Set<K> KeySet() :以Set的形式返回所有的key
        Set<String> keys=map.keySet();
        for (String key: keys) {
            System.out.println(key);
        }
    }
}
