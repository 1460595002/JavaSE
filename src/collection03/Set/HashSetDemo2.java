package collection03.Set;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 09:22
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class HashSetDemo2 {

    public static void main(String[] args) {
        //�������϶��� ���ϴ洢Student ����
        HashSet<Student> st = new HashSet<>();

        //�洢

        Student student = new Student("��ǫ",43);
        st.add(student);
        st.add(new Student("���¸�",44));
        st.add(new Student("��ǫ",43));
        st.add(new Student("������",23));
        st.add(student);


        for (Student student1 : st) {
            System.out.println(student1);

        }


    }
}
