package collection.List;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/10 0010
 * Time: 11:25
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

        coll.add(false);

        //1.contains(Object o)判断当前的集合是否存在o
        //我们判断的时候会调用o对象所在类的equals()
        boolean contains=coll.contains(123);
        System.out.println(contains);








    }
}
