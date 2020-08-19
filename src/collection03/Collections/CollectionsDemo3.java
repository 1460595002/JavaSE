package collection03.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 11:05
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");
        //排序方法  按照第一个单词的降序
        Comparator<String> comparator=(String o1, String o2)->{
            return o1.charAt(0)-o2.charAt(0);
        };


        Collections.sort(list,comparator );
        System.out.println(list);
    }
}
