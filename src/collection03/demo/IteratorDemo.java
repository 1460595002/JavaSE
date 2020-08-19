package collection03.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 14:03
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class IteratorDemo {

    public static void main(String[] args) {
        //使用多态的方式创建对象
      Collection<String> coll = new ArrayList<>();

      //添加元素到集合
        coll.add("喵星人");
        coll.add("吐槽星人");
        coll.add("汪星人");
        coll.add("二哈");

        //遍历
        //使用迭代器 遍历每个集合对象都有自己的迭代器
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

//增强for循环
class NBForDemo1{

    public static void main(String[] args) {
        int arr[]={2,5,54,85};
        for (int a : arr) {
            System.out.println(a);
        }
    }
}

class  NBFor{
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("小河神");
        coll.add("老河神");
        coll.add("神婆");
        //使用增强for循环
        for (String s : coll) {//接收变量s代表 代表被遍历到的集合元素
            System.out.println(s);
        }
    }
}