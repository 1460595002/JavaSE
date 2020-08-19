package collection03.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 11:41
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Demo {

    public static void main(String[] args) {
        //创建四个对象
        ArrayList<Student> list  = new ArrayList<>();
        Collections.addAll(list,new Student("rose",18),
                new Student("jack",16),new Student("abc",19),new Student("ACE",25));

         Collections.sort(list, new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return o1.getAge()-o1.getAge();//以学生的年龄降序
             }
         });

        for (Student student : list) {
            System.out.println(student);
        }

    }
}
