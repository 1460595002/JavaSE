package collection03.Set;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 09:22
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class HashSetDemo2 {

    public static void main(String[] args) {
        //创建集合对象 集合存储Student 类型
        HashSet<Student> st = new HashSet<>();

        //存储

        Student student = new Student("刘谦",43);
        st.add(student);
        st.add(new Student("郭德纲",44));
        st.add(new Student("刘谦",43));
        st.add(new Student("郭麒麟",23));
        st.add(student);


        for (Student student1 : st) {
            System.out.println(student1);

        }


    }
}
