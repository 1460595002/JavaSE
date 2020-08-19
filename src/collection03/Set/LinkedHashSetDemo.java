package collection03.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 10:07
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("bbc");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
