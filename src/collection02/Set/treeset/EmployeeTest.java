package collection02.Set.treeset;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/10 0010
 * Time: 10:13
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class EmployeeTest {

    //使用自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("liudehua",55,new MyDate(1999,5,4));
        Employee e2 = new Employee("zhangxueyou",43,new MyDate(1997,5,4));
        Employee e3 = new Employee("guofucheng",44,new MyDate(1989,5,9));
        Employee e4 = new Employee("liming",51,new MyDate(2001,8,12));
        Employee e5 = new Employee("liangzhaowei",21,new MyDate(2000,12,4));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //问题二：按生日日期的先后排序
    @Test
    public void test2(){
      TreeSet set =new TreeSet(new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
              if (o1 instanceof Employee && o2 instanceof  Employee){
                  Employee e1= (Employee) o1;
                  Employee e2= (Employee) o2;

                  MyDate b1=e1.getMyDate();
                  MyDate b2 = e2.getMyDate();

                  //方式一：
//                    //比较年
//                    int minusYear = b1.getYear() - b2.getYear();
//                    if(minusYear != 0){
//                        return minusYear;
//                    }
//                    //比较月
//                    int minusMonth = b1.getMonth() - b2.getMonth();
//                    if(minusMonth != 0){
//                        return minusMonth;
//                    }
//                    //比较日
//                    return b1.getDay() - b2.getDay();

                  //方式二：
                  return b1.compareTo(b2);

              }
//                return 0;
              throw new RuntimeException("传入的数据类型不一致！");
          }
      });

    }
}
