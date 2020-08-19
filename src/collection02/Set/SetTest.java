package collection02.Set;

import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/9 0009
 * Time: 10:50
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class SetTest {

     /*
    一、Set：存储无序的、不可重复的数据
    以HashSet为例说明：
    1. 无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的。

    2. 不可重复性：保证添加的元素按照equals()判断时，不能返回true.即：相同的元素只能添加一个。



    二、添加元素的过程：以HashSet为例：
        我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，
        此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置），判断
        数组此位置上是否已经有元素：
            如果此位置上没有其他元素，则元素a添加成功。 --->情况1
            如果此位置上有其他元素b(或以链表形式存在的多个元素），则比较元素a与元素b的hash值：
                如果hash值不相同，则元素a添加成功。--->情况2
                如果hash值相同，进而需要调用元素a所在类的equals()方法：
                       equals()返回true,元素a添加失败
                       equals()返回false,则元素a添加成功。--->情况2

        对于添加成功的情况2和情况3而言：元素a 与已经存在指定索引位置上数据以链表的方式存储。
        jdk 7 :元素a放到数组中，指向原来的元素。
        jdk 8 :原来的元素在数组中，指向元素a
        总结：头插法 尾插法  七上八下

        HashSet底层：数组+链表的结构。

     */

    @Test
    public void test1(){

        HashSet set = new HashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add("AA");
        set.add("BB");
        set.add(new User("金融啊",20));
        set.add(new User("tom",20));
        set.add(654);


        Iterator iterator=set.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }

    //LinkedHashSet的使用
    //LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据前一个数据与后一个数据
    //对于频繁的遍历操作，LinkedHashSet效率高于HashSet
    @Test
    public void test2(){
        LinkedHashSet set = new LinkedHashSet();
        set.add(112);
        set.add(112);
        set.add(789);
        set.add("AA");
        set.add("BB");
        set.add(new User("金融啊",20));
        set.add(new User("tom",20));
        set.add(654);


        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test3(){
        TreeSet treeSet = new TreeSet();
        //失败：不能添加不同类的元素
        // java.lang.Integer cannot be cast to java.lang.String
//        treeSet.add(112);
//        treeSet.add("adf");
//        treeSet.add(2444);


        //1.添加相同类型的元素:
//        treeSet.add(123);
//        treeSet.add(456);
//        treeSet.add(789);

        //2.添加相同类型的元素:
        treeSet.add(new User("Tom",12));
        treeSet.add(new User("Jerry",13));
        treeSet.add(new User("Jim",14));
        treeSet.add(new User("Jim",15));
        treeSet.add(new User("Mike",19));
        treeSet.add(new User("Jack",22));

        //迭代器迭代
         Iterator iterator=treeSet.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

    }

    @Test
    public void test(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Mary",33));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
