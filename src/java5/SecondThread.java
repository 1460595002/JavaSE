package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 09:40
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//通过实现Runnable接口来创建线程类
public class SecondThread implements Runnable{
    private  int i;

    //重写run方法体
    public void run(){
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
           System.out.println(Thread.currentThread().getName()+" "+i);

        if (i==20){
             SecondThread secondThread=new SecondThread();
             new Thread(secondThread,"线程1").start();
             new Thread(secondThread,"线程2").start();
        }
        }
    }
}
