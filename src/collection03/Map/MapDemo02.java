package collection03.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 20:43
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class MapDemo02 {

    public static void main(String[] args) {
        //����map����
        HashMap<String, String> map = new HashMap<>();
        //���Ԫ�ؼ�����ȥ
        map.put("����","������");
        map.put("���¸�", "��ǫ");
        map.put("Ѧ֮ǫ", "����ΰ");

        //��ȡentry���� entrySet
        Set<Map.Entry<String, String>> set = map.entrySet();


        for (Map.Entry<String, String> en : set) {
            System.out.println(en);
        }
    }
}
