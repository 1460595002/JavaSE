package java5.DeadLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 19:49
 * E-mail:1460595002@qq.com
 * 类说明:解决线程安全问题方式3:Lock锁----JDK1.5新增
 *
 * 1.面试题：synchronized与Lock的异同？
 *  相同：都可以解决线程安全的问题
 *  不同：synchronized在机制在执行完对应的代码，自动释放同步监听
 *  Lock需要手动启动同步（lock()）,同时结束同步也需要手动手动实现（unlock()）
 */



class Window implements  Runnable {

    private int ticker = 100;

    //1.实例化ReentrantLock
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //卖票
        while (true) {

            try {
                //调用加锁
                lock.lock();
                if (ticker > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票，当前的票号是" + ticker);
                    ticker--;
                } else {
                    break;
                }
            }finally {
                //调用解锁
                lock.unlock();
            }



        }
    }
}


public class LockTest {


    public static void main(String[] args) {

             Window window=new Window();

             Thread t1=new Thread(window);
             Thread t2=new Thread(window);
             Thread t3=new Thread(window);

             t1.setName("窗口1：");
             t2.setName("窗口2：");
             t3.setName("窗口3：");
             t1.start();
             t2.start();
             t3.start();



            }


        }


