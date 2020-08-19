package collection03.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 11:33
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Demo1Collection {


    public static void main(String[] args) {
        //创建集合对象
        //使用多态形式
        Collection<String> coll = new ArrayList<>();
        //使用方法
        //添加功能  boolean  add(String s)
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");

        System.out.println(coll);

    	// boolean contains(E e) 判断o是否在集合中存在
        System.out.println(coll.contains("小李广"));
        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("移出石破天："+coll.remove("石破天"));
        // size() 集合中有几个元素
        System.out.println("集合中有"+coll.size()+"个元素");

        // Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();

        //遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        //清空集合
        coll.clear();
        System.out.println("现在集合内容为:"+coll);
        //判断是否为空
        System.out.println(coll.isEmpty());

    }
}
