package collection03.Map.demo;

import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 21:01
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class HashMapTest {

    public static void main(String[] args) {
        //1.创建HashMap对象
        HashMap<Student, String> map = new HashMap<>();
        //添加元素
        map.put(new Student("lisi",28),"上海");
        map.put(new Student("wangwu",22),"北京");
        map.put(new Student("zhaoliu",24),"成都");
        map.put(new Student("周期",25),"广州");

        //取出元素，键找值额方式
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key+"....."+value);
        }


    }
}
