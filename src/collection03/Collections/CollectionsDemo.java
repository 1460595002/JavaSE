package collection03.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 10:46
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ԭ����д��
        //list.add(12);
        //list.add(14);
        //list.add(15);
        //list.add(1000);

        //���ù�����������������Ԫ��
        Collections.addAll(list,12,222,15,1000,85);
        System.out.println(list);

        //����д��
        Collections.sort(list);
        System.out.println("�����"+list);



    }

}
