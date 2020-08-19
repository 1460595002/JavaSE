package collection03.List;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 08:29
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList= new LinkedList<>();

        //添加元素
        linkedList.addFirst("abc1");
        linkedList.addFirst("abc2");
        linkedList.addFirst("abc3");

        //获取元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        //删除元素
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        while (!linkedList.isEmpty()){//判断集合是否为空
            System.out.println("弹出集合中的栈顶元素"+linkedList.pop());//弹出集合中的栈顶元素
        }
        System.out.println(linkedList);
    }

}
