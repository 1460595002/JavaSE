package collection.List.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/10 0010
 * Time: 15:10
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestReme {

    @Test
            public void remo1(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updatelist(list);
        System.out.println(list);
    }

    private static  void  updatelist(List list){
//        list.remove(2);//没有装箱默认通过索引删除数据
        list.remove(new Integer(2));//删除数据2。把它装箱
    }

}
