package collection.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 集合元素遍历的操作，使用迭代器Iteratos接口
 1.内部的方法：hashNext()和next()
 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象
 3.内部定义了remove()，可以在遍历的时候，删除集合的元素。这个方法不是集合的remove()方法
 */
public class IteratorTest {


    @Test
    public void test1(){
        Collection coll=new ArrayList();
        for (int i=0;i<20;i++){

            coll.add("测试"+i);
        }

        //创建迭代器
        Iterator it=coll.iterator();
        //方式一：
       while (it.hasNext()){

           System.out.println(it.next());
       }




    }

}
