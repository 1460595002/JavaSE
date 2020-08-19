package collection03.Map.Linked;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ¹ù½ğÈÙ
 * Date: 2020/6/20 0020
 * Time: 21:15
 * E-mail:1460595002@qq.com
 * ÀàËµÃ÷:
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("µË³¬", "ËïÙ³");
        map.put("Àî³¿", "·¶±ù±ù");
        map.put("ÁõµÂ»ª", "ÖìÀöÙ»");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }
}
