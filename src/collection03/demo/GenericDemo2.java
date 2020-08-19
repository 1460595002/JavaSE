package collection03.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 14:30
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class GenericDemo2 {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("adb");
        coll.add("itcast");
        // list.add(5);//当集合明确类型后，存放类型不一致就会编译报错
        // 集合已经明确具体存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型
        Iterator<String> iterator = coll.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            //当使用Iterator<String>控制元素类型后，就不需要强转了。获取到的元素直接就是String类型

            System.out.println(s.length());
        }
    }
}
