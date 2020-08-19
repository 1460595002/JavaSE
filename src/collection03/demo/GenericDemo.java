package collection03.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 14:22
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class GenericDemo {

    public static void main(String[] args) {
        Collection coll = new ArrayList<>();
         coll.add("abc");
         coll.add("itcast");
         coll.add(5);//由于集合没有做任何限定，任何类型都可以给其中存放

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            //需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String)iterator.next();
            System.out.println(str.length());
        }

    }
}
