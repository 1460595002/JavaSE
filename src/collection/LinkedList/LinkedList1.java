package collection.LinkedList;

import collection.Hero.Hero;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/9 0009
 * Time: 10:22
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class LinkedList1 {


    //双项链表
    @Test
    public void collection(){

        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> list =new LinkedList<Hero>();

        //LinkedList很方便的进行头部尾部的插入数据
        //在最后插入数据
        list.addLast(new Hero("英雄1"));
        list.addLast(new Hero("英雄2"));
        list.addLast(new Hero("英雄3"));
        list.addLast(new Hero("英雄4"));
        list.addLast(new Hero("英雄5"));
        System.out.println("list中的数据是："+list);

        //在最最前面插入新的英雄
        list.addFirst(new Hero("英雄x"));
        System.out.println("list中的数据是："+list);


        //查看最前面的数据
        System.out.println("list最前面的数据是："+list.getFirst());
        //查看最后的数据
        System.out.println("list最后面的数据是:"+list.getLast());

       //查看数据不会导致数据删除
        System.out.println("现在list的数据是："+list);

        //取出最前面的数据
        System.out.println("最前面的数据是："+list.removeFirst());
        //取出最后一个数据
        System.out.println("取出最后一个数据："+list.removeLast());

        //取出数据导致数据删除
        System.out.println("最后list的数据是："+list);







    }



    @Test
    public void conllection(){
        //LinkedList实现类List接口
         List<Hero> list =new LinkedList<>();



         //LinekdList实现了Deque Deque实现了queue
        /**
         * offer:在最后添加元素
         * poll:取出第一个元素
         * peek：查看第一个元素
         */
        Queue<Hero>queue=new  LinkedList<>();
        queue.offer(new Hero("英雄1"));
        queue.offer(new Hero("英雄2"));
        queue.offer(new Hero("英雄3"));
        queue.offer(new Hero("英雄4"));
        queue.offer(new Hero("英雄5"));
        queue.offer(new Hero("英雄6"));

        System.out.println("queue中的元素是："+queue);

        //取出queue中第一个元素
        System.out.println(queue.poll());
        //第一个元素已经删除了
        System.out.println("queue中的元素是："+queue);


        //查看queue中第一个元素

        System.out.println(queue.peek());
        //查看不会导致元素的删除
        System.out.println("queue中的元素是："+queue);








    }
}
