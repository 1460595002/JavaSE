package exercise;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/8/18 0018
 * Time: 22:20
 * E-mail:1460595002@qq.com
 * ��˵��:ʮ������
 */
public class TenSorting {

    //ð������
    @Test
    public void BubbleSortTest(){
        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length-1; i++) {
            //j��һ��Ԫ��Ҫ�ƶ��Ĵ������ƶ���һ����ȥ�±�i�����ƶ�
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            //8 12 15 23 24 45 78 456
        }
    }

    //ѡ������
    @Test
    public void selectionSort(){
        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = 0; j < arr.length; j++) {
                 if (arr[minIndex]<arr[j]){//�ҵ���С����
                     minIndex=j;//����С������������
                 }
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //��������
    @Test
    public void insertionSort(){

        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        int current;
        for (int i = 0; i < arr.length-1; i++) {
            current=arr[i+1];
          int preIndex=i;

          while (preIndex>0&&arr[preIndex]>current){
              arr[preIndex+1]=arr[preIndex];

            preIndex--;
          }

          arr[preIndex+1]=current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
