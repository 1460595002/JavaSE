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

        int temp=0;
        boolean falg=false;
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                 if (arr[j]>arr[j+1]){
                     falg=true;

                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
            }
            if (!falg){
               break;//һ�ζ�û����
            }else {
                falg=false;  //����
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    //ѡ������
    @Test
    public void selectionSort() {
        int[] arr = new int[]{8, 456, 45, 23, 78, 24, 15, 12};

        for (int i = 0; i < arr.length; i++) {
            int minNum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[minNum]) {//�ҳ���С���Ǹ�����
                    minNum = j;
                }
                int temp = arr[minNum];
                arr[minNum] = arr[j];
                arr[j] = temp;
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

    //ϣ������

    /**
     * ϣ�������ǶԲ�������ĸĽ����������ǲ����ڵ�Ԫ���Զ�����ľֲ��������򣬲������ò������򽫾ֲ��������������ϣ��������ʹ������������Ϊh��Ԫ�ض�������ģ����������鱻��Ϊh�������飨һ��h�������鼴һ����h��������������ɵ����飩���ڽ�������ʱ�����h�ܴ󣬾��ܽ�Ԫ���ƶ�����Զ�ĵط���Ϊʵ�ָ�С��h�����췽�㡣
     * ϣ�������ֳơ���С�������򡱣�����ÿ��h���ò�������h�����������������ֻ��Ҫ�ڲ�������Ĵ����н��ƶ�Ԫ�صľ�����1��Ϊh���ɣ�����ϣ�������ʵ�־�ת��Ϊһ�������ڲ�������ʹ�ò�ͬ�����Ĺ��̡�
     * ϣ�������ִ��ʱ���������������У�ϣ������ʱ�临�Ӷ�ΪO(N^2)��Hibbard������ϣ������ʱ�临�Ӷ�ΪO(N��1.5�η������½�ΪN*log2N�����ȶ��������㷨��
     * Javaʵ�ִ������£�
     */
    @Test
    public  void shellSort(){
        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        int N=arr.length;

        for (int h=N/2;h>0;h/=2){//ϣ������
            for (int i = 0; i <N ; i++) {
              //arr[i]����a[i-h],arr[i-2h],a[i-3h]...��
                for (int j = i; j >=h && arr[j]<arr[j-h] ; j-=h) {

                    int temp =arr[j];
                    arr[j]=arr[j-h];
                    arr[j-h]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);
        }
    }

}
