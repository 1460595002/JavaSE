package Set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/10 0010
 * Time: 21:37
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TreeSetTest {
/**
 * 1.向Treeset中添加数据，要求相同类
 * 2.两种排序法方式：自然排序（实现Comparable接口）和定制排序（Comarator)
 *3.自然排序中比较，两个对象相同的标准是compareTo（）返回0，不再是equeala().
 *4.定制排序中，比较两个对象是否相同的标准是：compare()返回0
 *
 *
 */


    @Test
    public void test1(){
        TreeSet tree=new TreeSet();
        //不同类对象不能进行添加
//            tree.add(123);
//            tree.add(new User());
//            tree.add(new User("Tom",12));

        System.out.println(tree);
        //举例二：

//        tree.add(new User("Tom",12));
        tree.add(new User("Jerry",32));
        tree.add(new User("Jim",2));
        tree.add(new User("Mike",65));
        tree.add(new User("Jack",33));
//        tree.add(new User("Jack",56));


        //通过迭代器进行遍历
        Iterator iterator=tree.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }

    }


    @Test
    public void  test2(){


        Comparator comparator =new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                if (o1 instanceof  User && o2 instanceof User){

                     User user1=(User)o1;
                    User user2=(User)o2;

                    return Integer.compare(user1.getAge(),user2.getAge());
                }else {
                   throw  new RuntimeException("输入数据类型不一致");

                }

            }
        };



        //按照年龄大小进行排序
        TreeSet set=new TreeSet(comparator);
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



