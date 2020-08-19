package java5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/6 0006
 * Time: 15:51
 * E-mail:1460595002@qq.com
 * 类说明:
 *
 * 创建线程方式三：实现Callable接口。  ------JDK1.5接口
 *
 *
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式更加强大？
 * 1.call()可以有返回值的
 * 2.call()可以抛出异常，被外面捕获，获取异常信息
 * 3.Callable是支持泛型的
 *
 *
 */

//1.创建实现Callable的实现类
class NumThread implements Callable {
   //实现call方法，将这个线程需要执行的操作声明在call中
    int sum=0;
    @Override
    public Object call() throws Exception {

        for (int i=1;i<=100;i++){


            if (i%2==0){
                sum+=i;

                System.out.println(i+" ");


            }


        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable接口的实现类的对象
        NumThread num=new NumThread();
        //4.将此Callable接口实现类的对象作为传递到FutreTatsk构造器中 创建FutreTask的对象
        FutureTask futureTask = new FutureTask(num);
        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();


        try {
            //6.获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。

           Object sum=futureTask.get();

            System.out.println("总和："+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
