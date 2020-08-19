package Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/18 0018
 * Time: 11:10
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//测试Lock锁
public class TestLock {
    public static void main(String[] args) {
        TestLock2 l1 = new TestLock2();

        new Thread(l1,"线程一：").start();
        new Thread(l1,"线程二：").start();

    }


}

class TestLock2 implements Runnable{

    //票
    private int ticketNums=10;

    boolean flag=true;

    //定义lock锁
    private final ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (flag){
            buy();
        }

    }


    private  void buy(){
        lock.lock(); //加lock锁
        try {

            //判断是否有票
            if (ticketNums<=0){
                flag=false;
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了--->"+ticketNums--);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();//解锁
        }

    }
}