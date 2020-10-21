package mapL.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
Map的第一种遍历方式：
    首先召集所有的丈夫（key）
    遍历所有的丈夫
    获取每一个丈夫
    让每一个丈夫找到自己的媳妇（value）
 */
public class MapDemo4 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map=new HashMap<String, String>();
        //添加映射关系
        map.put("谢霆锋","张希芝");
        map.put("陈冠希","钟欣桐");
        map.put("黎燕楠","王菲");
        //遍历Map对象

        //首先召集所有的丈夫
        Set<String> keys=map.keySet();
        //遍历所有的丈夫
        for (String key: keys) {
            //让每一个丈夫找到自己的媳妇
            String value=map.get(key);
            System.out.println("丈夫："+key+"---"+"媳妇："+value);
        }
    }
}
