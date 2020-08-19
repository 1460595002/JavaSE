package collection.exer;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/11 0011
 * Time: 17:33
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Employeetest {


    @Test
    public void test(){
        TreeSet set=new TreeSet();

        Employee e1 = new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2 = new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3 = new Employee("guofucheng",44,new MyDate(1987,5,9));
        Employee e4 = new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5 = new Employee("liangzhaowei",21,new MyDate(1978,12,4));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);



        //创建迭代对象
        Iterator iterator=set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }




}
