package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/8/18 0018
 * Time: 10:51
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class ArrayTest {
    public static void main(String[] args) {

        String[] arr = new String[]{"d", "df", "ege", "gfg"};

        String[] arr1 = new String[arr.length];

/*        //�鿴arr�����е�����
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //���鸳ֵ

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];

        }
/*
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1:"+arr1[i]);
        }*/


        //���鷴ת
/*        //��ʽһ��
        for (int i = 0; i < arr1.length/2; i++) {
          String temp=arr1[i];
          arr1[i]=arr1[arr1.length-i-1];
          arr1[arr1.length-i-1]=temp;

        }*/
        //��ʽ����
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            String temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;

        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //���ң�����������
        //���Բ���
        String dest = "df";
        boolean isFlag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (dest.equals(arr1[i])) {
                System.out.println("�ҵ���" + dest + "��λ�õ�" + i);
                isFlag = true;
                break;
            }
        }
        if (isFlag = false) {
            System.out.println("û���ҵ�Ŷ������");
        }
        //���ַ�����
        //���ַ����ң�(��Ϥ)
        //ǰ�᣺��Ҫ���ҵ������������
        int[] arr3 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};

        //��Ҫ���ҵ�Ԫ��
        int dest1 = -98;

        int head = 0;//��һ��
        int end = arr3.length - 1;//���һ��
        boolean isFlag1 = false;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest1 == arr3[middle]) {
                System.out.println("�Ѿ��ҵ�λ�ã�" + middle);
                isFlag1 = true;
                break;
            } else if (dest1 < arr3[middle]) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }

        }

        if (isFlag1 == false) {
            System.out.println("û���ҵ�Ŷ��");
        }

    }
}
