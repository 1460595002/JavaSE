package collection03.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 15:01
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MyImp1 implements MyGenericInterface<String>{
    Collection<String> coll = new ArrayList<>();

    @Override
    public void add(String s) {
        coll.add(s);
    }

    @Override
    public String getE() {

        return coll.toString();
    }
}
class GenericInterface{
    public static void main(String[] args) {
        MyImp1 myImp1 = new MyImp1();
        myImp1.add("aa");
        System.out.println(myImp1.getE());
    }
}
