package collection03.Map;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 20:12
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class MapDemo {

    public static void main(String[] args) {
        //����map����
        HashMap<String, String> map = new HashMap<>();

        //���Ԫ�ص�����
        map.put("������","��ӱ");
        map.put("����","�����P");
        map.put("�˳�","��ٳ");
        System.out.println(map);

        //String remove(String key)

        //�鿴������ϱ����˭
        System.out.println(map.get("������"));
        System.out.println(map.get("�˳�"));
    }
}
