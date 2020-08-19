package collection.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *  jdk 1.5新增foreach循环，用于遍历集合，数组
 */
public class Foreach {


    @Test
    public void test1(){
        List<Person> list=new ArrayList<>();

        //给list进行初始化
        for (int i=0;i<20;i++){
            list.add(new Person("学生的学号:"+i,18));


        }

        //foreach遍历list集合中的数据
        //内部调用了迭代器
        for (Object object:list) {
            System.out.println(object);

        }


    }

    @Test
    public void test2(){
        int []arr=new int[]{1,2,3,4,5,67,7};

        for (int a:arr){
            System.out.println(a);
        }
    }

    //练习题
    @Test
    public void test3(){

        String[] arr = new String[]{"MM","MM","MM"};

//        //方式一：普通for赋值
//        for(int i = 0;i < arr.length;i++){
//            arr[i] = "GG";
//        }

        //方式二：增强for循环
        for(String s : arr){
            s = "GG";
        }

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}



