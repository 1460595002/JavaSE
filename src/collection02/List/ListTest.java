package collection02.List;

import java1.Array;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/9 0009
 * Time: 16:12
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ListTest {
        /*
void add(int index, Object ele):在index位置插入ele元素
boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
Object get(int index):获取指定index位置的元素
int indexOf(Object obj):返回obj在集合中首次出现的位置
int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
Object remove(int index):移除指定index位置的元素，并返回此元素
Object set(int index, Object ele):设置指定index位置的元素为ele
List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

总结：常用方法
增：add(Object obj)
删：remove(int index) / remove(Object obj)
改：set(int index, Object ele)
查：get(int index)
插：add(int index, Object ele)
长度：size()
遍历：① Iterator迭代器方式
     ② 增强for循环
     ③ 普通的循环

     */

    @Test
    public void test1(){
        ArrayList arr=new ArrayList();
        arr.add(123);
        arr.add(456);
        arr.add(789);
        arr.add("AA");
        arr.add("bbb");

        //通过迭代器进行遍历
        Iterator iterator=arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //通过for循环
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(arr.get(i));
        }

        //增强for循环
        for (Object object: arr) {
            System.out.println(object);
        }

    }

    @Test
    public void test2(){

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);
        //int indexOf(Object obj):返回obj在集合中首次出现的位置。如果不存在，返回-1.
        int i = list.indexOf(456);
        System.out.println(i);

//        int lastIndexOf(Object obj) 返回obj在当前集合中最后一次出现的位置。如果不存在，返回-1.

        System.out.println(list.lastIndexOf(456));

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(0));
        System.out.println(list);
        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(0,"cc");
        System.out.println(list);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开区间的子集合
        List subList = list.subList(2, 4);
        System.out.println(subList);
        System.out.println(list);
    }

    @Test
    public void test3(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);

        System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
//        list.add(list1);
        System.out.println(list.size());//9

        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));
    }
}
