package collection03.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 11:05
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");
        //���򷽷�  ���յ�һ�����ʵĽ���
        Comparator<String> comparator=(String o1, String o2)->{
            return o1.charAt(0)-o2.charAt(0);
        };


        Collections.sort(list,comparator );
        System.out.println(list);
    }
}
