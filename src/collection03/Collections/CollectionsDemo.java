package collection03.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 10:46
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //原来的写法
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);

        //采用工具类完成往集合添加元素
        Collections.addAll(list,12,222,15,1000,85);
        System.out.println(list);

        //排序写法
        Collections.sort(list);
        System.out.println("排序后："+list);



    }

}
