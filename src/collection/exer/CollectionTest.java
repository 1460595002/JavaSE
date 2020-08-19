package collection.exer;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 reverse(List)：反转 List 中元素的顺序
 shuffle(List)：对 List 集合元素进行随机排序
 sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
 sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
 swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

 Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
 Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
 Object min(Collection)
 Object min(Collection，Comparator)
 int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
 void copy(List dest,List src)：将src中的内容复制到dest中
 boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
 */
public class CollectionTest {


    @Test
    public void test2(){
        List list=new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);

        //把上面的list集合装进另一个集合
        List dest= Arrays.asList(new Object[list.size()]);
        System.out.println(list.size());
        Collections.copy(dest,list);
        System.out.println(dest);


        /**
         * Collections 类中提供了多个 synchronizedXxx() 方法，
         *         该方法可使将指定集合包装成线程同步的集合，从而可以解决
         *         多线程并发访问集合时的线程安全问题
         */
        //返回一个线程安全的集合
        List list1=Collections.synchronizedList(list);

    }

    @Test
    public void test1(){
        Collection collection=new ArrayList();

        collection.add(123);
        collection.add(456);
        collection.add(789);
        collection.add(363);

        //方法引用
        collection.forEach(System.out::println);


    }


   //HashSet存储方式：
    @Test
    public void test3(){
        HashSet set=new HashSet();


        Person p1=new Person(444,"AA");
        Person p2=new Person(46465,"BB");
        Person p3=new Person(454541,"CC");

        set.add(p1);
        set.add(p2);
        set.add(p3);


//        System.out.println(set);

      p1.name="DD";
      set.remove(p1);
//        System.out.println(set);

        set.add(new Person(33333,"PP"));
        System.out.println(set);



    }
}
