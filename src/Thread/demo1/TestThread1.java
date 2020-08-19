package Thread.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/16 0016
 * Time: 15:05
 * E-mail:1460595002@qq.com
 * 类说明:
 */

//创建线程方式一：继承Thread类，重写run方法，调用start开启线程
public class TestThread1 extends Thread{

    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i <200 ; i++) {
            System.out.println("我在学习java呢！"+i);
        }
    }

    public static void main(String[] args) {
        //main线程主线程
        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();
        //调用start()方法开启线程
        testThread1.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("我在看p站呢哈哈哈哈哈"+i);
        }

    }
}
