package collection03.Map.demo;

import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 21:01
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class HashMapTest {

    public static void main(String[] args) {
        //1.����HashMap����
        HashMap<Student, String> map = new HashMap<>();
        //���Ԫ��
        map.put(new Student("lisi",28),"�Ϻ�");
        map.put(new Student("wangwu",22),"����");
        map.put(new Student("zhaoliu",24),"�ɶ�");
        map.put(new Student("����",25),"����");

        //ȡ��Ԫ�أ�����ֵ�ʽ
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key+"....."+value);
        }


    }
}
