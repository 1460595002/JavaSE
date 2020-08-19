package Thread.state;

import Thread.demo1.TestThread4;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 09:31
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//模拟网络延时方法问题的发生性
public class TestSleep implements Runnable {
    //票数
    private int ticketNums=10;


    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            //模拟演示
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNums--+"张票。");
        }



    }

    public static void main(String[] args) {
        TestSleep t1=new TestSleep();

        new Thread(t1,"小明").start();
        new Thread(t1,"小红").start();
        new Thread(t1,"小龙").start();
        new Thread(t1,"黄牛").start();
    }

}
