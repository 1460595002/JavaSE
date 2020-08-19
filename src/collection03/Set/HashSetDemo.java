package collection03.Set;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 08:37
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建Set集合
        HashSet<String> set = new HashSet<>();

        //添加元素
        set.add(new String("cba"));
        set.add("bac");
        set.add("cba");
        set.add("abc");
        //遍历
        for (String s : set) {
            System.out.println(s);
        }
    }
}
