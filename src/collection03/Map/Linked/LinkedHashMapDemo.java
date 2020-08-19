package collection03.Map.Linked;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 21:15
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("�˳�", "��ٳ");
        map.put("�", "������");
        map.put("���»�", "����ٻ");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }
}
