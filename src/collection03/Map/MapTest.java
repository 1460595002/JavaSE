package collection03.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 21:32
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class MapTest {

    public static void main(String[] args) {
        //������ʾ
        System.out.println("������һ���ַ�����");
        String line = new Scanner(System.in).nextLine();

        findChar(line);
    }
    private static void findChar(String line){
        //1������һ������ �洢 �ַ��Լ�����ֵĴ���
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            //�ж� ���ַ��Ƿ��ڼ�����
            if (!map.containsKey(c)){
                //�Ǿ��ǵ�һ��
                map.put(c,1);
            }else {
                //�Ȼ�ȡ֮ǰ�Ĵ���
                Integer integer = map.get(c);
                //�ڴ������
                map.put(c,++integer);

            }
        }
        System.out.println(map);
    }
}
