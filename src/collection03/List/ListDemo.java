package collection03.List;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 21:03
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建List集合对象
        ArrayList<String> list = new ArrayList<>();

        //往尾部进行添加元素
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);
        //add(int index,String s) 指定索引进行添加
        list.add(1,"替换");

        System.out.println(list);

        //删除索引2的元素
        System.out.println("删除索引为2的元素");
        System.out.println(list.remove(3));
        System.out.println(list);

        //String set(int index,String s)
        //指定位置 进行元素替换（改）
        //修改指定位置的元素
        list.set(0,"图图1号");
        System.out.println(list);

        // String get(int index)  获取指定位置元素
        System.out.println("=======");
        // 跟size() 方法一起用  来 遍历的
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
