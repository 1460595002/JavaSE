package exercise;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/8/18 0018
 * Time: 22:20
 * E-mail:1460595002@qq.com
 * 类说明:十大排序
 */
public class TenSorting {

    //冒泡排序
    @Test
    public void BubbleSortTest(){
        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length-1; i++) {
            //j第一个元素要移动的次数，移动完一个减去下标i继续移动
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

    //选择排序
    @Test
    public void selectionSort(){
        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = 0; j < arr.length; j++) {
                 if (arr[minIndex]<arr[j]){//找到最小的数
                     minIndex=j;//将最小数的索引保存
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

    //插入排序
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
