package collection03.Map;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 20:12
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MapDemo {

    public static void main(String[] args) {
        //创建map对象
        HashMap<String, String> map = new HashMap<>();

        //添加元素到集合
        map.put("黄晓明","杨颖");
        map.put("文章","马伊琍");
        map.put("邓超","孙俪");
        System.out.println(map);

        //String remove(String key)

        //查看黄晓明媳妇是谁
        System.out.println(map.get("黄晓明"));
        System.out.println(map.get("邓超"));
    }
}
