package collection03.Set;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 08:37
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //����Set����
        HashSet<String> set = new HashSet<>();

        //���Ԫ��
        set.add(new String("cba"));
        set.add("bac");
        set.add("cba");
        set.add("abc");
        //����
        for (String s : set) {
            System.out.println(s);
        }
    }
}
