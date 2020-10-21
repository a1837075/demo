package mapL.itheima;

import java.util.HashMap;
import java.util.Map;

/**
Map得常用功能：
    映射功能：
        V put(K key,V value)
    获取功能：
        V get(Object key)
        int size()
    判断功能：
        boolean containsKey(Object key)
        boolean containsValue(Object value)
        boolean isEmpty()
    删除功能：
        void clear()
        V remove(Object key)
    遍历：
        Set<Map.Entry<K,V> entrySet()

    Set<K> keySet()
        Collection<V> values()

 */
public class MapDemo2 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map=new HashMap<String, String>();

        //V put(K key,V value) :将key映射到value，如果key存在，则覆盖value，并将原来得value返回
        System.out.println(map.put("ITCAST001","张三"));
        System.out.println(map.put("ITCAST002","李四"));
        System.out.println(map.put("ITCAST001","王五"));

        //void clear():清空所有得对应关系
        //map.clear();

        //V remove(Object key) :根据指定得key删除对应关系，并返回key所对应得值，如果没有删除成功返回null
        //System.out.println(map.remove("ITCAST001"));

        //boolean containsKey(Object key) :判断指定得key是否存在
        //System.out.println(map.containsKey("ITCAST001"));

        //boolean containsValue(Object value)：判断指定得value是否存在
        //System.out.println(map.containsValue("王五"));

        //boolean isEmpty()：判断是否有对应关系
        //System.out.println(map.isEmpty());

        //int size() :返回对应关系的个数
        //System.out.println(map.size());

        //V get(Object key) :根据指定的key返回对应的value
        System.out.println(map.get("ITCAST002"));

        System.out.println(map);
    }
}
