package collection03.Map;

import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 20:30
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //����Map���϶���
        HashMap<String, String> map = new HashMap<>();
        //���Ԫ�ؼ�����ȥ
        map.put("����","������");
        map.put("���¸�", "��ǫ");
        map.put("Ѧ֮ǫ", "����ΰ");

        //��ȡ���е�key
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
    }
}
