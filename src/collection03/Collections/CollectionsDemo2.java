package collection03.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 10:54
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class CollectionsDemo2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");

        Collections.sort(list);
        System.out.println(list);
    }
}
