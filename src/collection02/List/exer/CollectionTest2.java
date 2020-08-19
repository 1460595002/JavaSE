package collection02.List.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/10 0010
 * Time: 08:42
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class CollectionTest2 {

    @Test
    public void test(){
       List list = new ArrayList();

        list.add(123);
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object i:list) {
            //有重复的数据
            System.out.println(i);
        }

    }

    //去除集合中重复的数值。
    public static List duplicateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);//把list集合中的全部元素添加进来进行去重

        return new ArrayList(set);
    }


    @Test
    public void test2(){
       List list = new ArrayList();

        list.add(123);
        list.add(123);
        list.add(456);
        list.add(789);

        List list1 = duplicateList(list);

        for (Object i:list1) {
            //重复的数据去除了
            System.out.println(i);
        }

    }

    @Test
    public void test3(){
        HashSet set=new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2= new Person(1002, "BB");

        set.add(p1);
        set.add(p2);

        System.out.println("set:"+set);
        p1.name="CC";//设置名称
        System.out.println(set);
        set.remove(p1);//移出p1的对象
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }

}
