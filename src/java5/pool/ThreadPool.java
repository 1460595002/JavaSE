package java5.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/6 0006
 * Time: 16:51
 * E-mail:1460595002@qq.com
 * 类说明:
 * 创建线程的方式创建线程池
 * 好处：
 * 1.提高响应的速度（减少了创建线程的时间）
 * 2.降低资源的消耗（重复了利用了线程池的线程，不需要每次的创建）
 * 3.便于线程的管理
 *
 */


class  NumThread implements Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
           //总数sum
        int sum =0;

        for (int i=1;i<=100;i++){

            if (i%2==0){

                sum+=i;
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }


    }
}
public class ThreadPool {

    public static void main(String[] args) {
        NumThread thread = new NumThread();

        //创建线程池  1.提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //设置线程池的属性
        ThreadPoolExecutor service1= (ThreadPoolExecutor) service;
        service1.setCorePoolSize(10);


        //getClass是Object的方法是获取对象在哪个类
        System.out.println(service.getClass());


         //2.执行指定的线程操作。需要提供Runnble接口或者Callable接口对象
        service.execute(thread);//适合用于Runnable
//        service.submit(thread);//使用于Callable
       //关闭线程池
        service.shutdown();

    }
}
