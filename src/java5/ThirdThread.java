package java5;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 10:39
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ThirdThread {


    public static void main(String[] args) {
        //创建Callable
        ThirdThread rt =new ThirdThread();

        //先使用Lambda表达式创建Callable<Integer>对象
        FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for (; i<100;i++){
                System.out.println(Thread.currentThread().getName()+" 的循环变量i的值："+i);

            }

            //call里有返回值
            return i;
        });

        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"循环变量值："+i);


            if(i==20){
                new Thread(task,"有返回值的线程：").start();
            }
        }
        try {
            System.out.println("子线程的返回值："+task.get());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
