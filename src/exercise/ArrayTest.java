package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/8/18 0018
 * Time: 10:51
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ArrayTest {
    public static void main(String[] args) {

        String[] arr = new String[]{"d", "df", "ege", "gfg"};

        String[] arr1 = new String[arr.length];

/*        //查看arr数组中的内容
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //数组赋值

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];

        }
/*
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1:"+arr1[i]);
        }*/


        //数组反转
/*        //方式一：
        for (int i = 0; i < arr1.length/2; i++) {
          String temp=arr1[i];
          arr1[i]=arr1[arr1.length-i-1];
          arr1[arr1.length-i-1]=temp;

        }*/
        //方式二：
        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
            String temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;

        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //查找（或者搜索）
        //线性查找
        String dest = "df";
        boolean isFlag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (dest.equals(arr1[i])) {
                System.out.println("找到了" + dest + "在位置的" + i);
                isFlag = true;
                break;
            }
        }
        if (isFlag = false) {
            System.out.println("没有找到哦！！！");
        }
        //二分法查找
        //二分法查找：(熟悉)
        //前提：所要查找的数组必须有序。
        int[] arr3 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};

        //需要查找的元素
        int dest1 = -98;

        int head = 0;//第一个
        int end = arr3.length - 1;//最后一个
        boolean isFlag1 = false;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest1 == arr3[middle]) {
                System.out.println("已经找到位置：" + middle);
                isFlag1 = true;
                break;
            } else if (dest1 < arr3[middle]) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }

        }

        if (isFlag1 == false) {
            System.out.println("没有找到哦！");
        }

    }
}
