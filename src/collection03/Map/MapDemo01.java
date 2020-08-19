package collection03.Map;

import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 20:30
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map集合对象
        HashMap<String, String> map = new HashMap<>();
        //添加元素集合中去
        map.put("胡歌","霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");

        //获取所有的key
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
    }
}
