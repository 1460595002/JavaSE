package collection02.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/9 0009
 * Time: 14:10
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("你好啊"));
        coll.add(false);

        coll.remove(12356);
        //1.contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()。
        boolean contains = coll.contains(12356);
        System.out.println(contains);

        System.out.println(coll.contains(new String("Tom")));

        System.out.println(coll.contains(new Person("Jerry",20)));

        //2.containsAll(Collection coll1):coll1所有的参数是否在coll集合中
        Collection coll1= Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test2(){
        //remove(Object o):从当前集合移除obj元素
        Collection coll =new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("你好啊"));
        coll.add(false);

        //移除456
        coll.remove(456);
        System.out.println(coll);
        coll.remove(new Person("Jerry",20));
        System.out.println(coll);

        //4. removeAll(Collection coll1):差集：从当前集合中移除coll1中所有的元素。
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test3(){

        Collection coll =new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("你好啊"));
        coll.add(false);

        // retainAll(Collection coll1):交集：获取当前集合和coll1集合的交集，并返回给当前集合
        // Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6.equals(Object obj):要想返回true，需要当前集合和形参集合的元素都相同。
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add(123);
        coll1.add(new Person("Jerry",20));
        coll1.add(new String("Tom"));
        coll1.add(false);

        System.out.println(coll.equals(coll1));

    }

    @Test
    public void test4(){

        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //7.hashCode返回当前对象的哈希值：
        System.out.println(coll.hashCode());

        //集合转换为数组：toArray()
        Object[] objects = coll.toArray();
        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i]);
        }

        //数组转换集合 调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1.size());//1

        List arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2.size());//2

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试

    }


}
