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
               break;//一次都没交换
            }else {
                falg=false;  //重置
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    //选择排序
    @Test
    public void selectionSort() {
        int[] arr = new int[]{8, 456, 45, 23, 78, 24, 15, 12};

        for (int i = 0; i < arr.length; i++) {
            int minNum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[minNum]) {//找出最小的那个数字
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

    //希尔排序

    /**
     * 希尔排序是对插入排序的改进，交换的是不相邻的元素以对数组的局部进行排序，并最终用插入排序将局部有序的数组排序。希尔排序先使数组中任意间隔为h的元素都是有序的，这样的数组被称为h有序数组（一个h有序数组即一个由h个有序子数组组成的数组），在进行排序时，如果h很大，就能将元素移动到很远的地方，为实现更小的h有序创造方便。
     * 希尔排序又称“缩小增量排序”，对于每个h，用插入排序将h个子数组独立地排序，只需要在插入排序的代码中将移动元素的距离由1改为h即可，这样希尔排序的实现就转化为一个类似于插入排序但使用不同增量的过程。
     * 希尔排序的执行时间依赖于增量序列，希尔增量时间复杂度为O(N^2)，Hibbard增量的希尔排序时间复杂度为O(N的1.5次方），下界为N*log2N，不稳定的排序算法。
     * Java实现代码如下：
     */
    @Test
    public  void shellSort(){
        int [] arr=new int[]{8,456,45,23,78,24,15,12};

        int N=arr.length;

        for (int h=N/2;h>0;h/=2){//希尔增量
            for (int i = 0; i <N ; i++) {
              //arr[i]插入a[i-h],arr[i-2h],a[i-3h]...中
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
