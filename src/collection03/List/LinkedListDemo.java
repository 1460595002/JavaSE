package collection03.List;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 08:29
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList= new LinkedList<>();

        //���Ԫ��
        linkedList.addFirst("abc1");
        linkedList.addFirst("abc2");
        linkedList.addFirst("abc3");

        //��ȡԪ��
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        //ɾ��Ԫ��
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        while (!linkedList.isEmpty()){//�жϼ����Ƿ�Ϊ��
            System.out.println("���������е�ջ��Ԫ��"+linkedList.pop());//���������е�ջ��Ԫ��
        }
        System.out.println(linkedList);
    }

}
