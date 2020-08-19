package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 21:49
 * E-mail:1460595002@qq.com
 * 类说明:打印100以内的数字  用线程一线程二分别交替打印出来
 * wait():一旦执行这个方法当前线程进入阻塞状态，并释放监听器。
 *ntify():一旦执行这个此方法就会换醒wait的线程。如果多个线程被wait，就会唤醒优先级别高的那个
 * ntifyall():一旦执行这个方法，就会幻想所有被wait的线程
 *
 *
 *
 *
 * 说明：
 * 1.wait(),notyfiy() notyfiyall()三个方法必须使用在同步代码块同步方法中去
 * 2.wait(),notyfiy(),notyfiyall()三个方法的调用者必须是同步方法代码块或者同步的方法中的同步监听器
 * 否则，会出现IllegalMonitorStateException异常
 *wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中
 *
 * 面试题：sleep()和wait()的异同？
 * 1.相同点一旦执行就进入阻塞状态
 * 2.不同点：1.两个方法声明的位置不一样，Thread类声明sleep(),Object声明wait()
 *   调用的要求不同：sleep()可以在任何需要的场景下调用。 wait()必须使用在同步代码块或同步方法中
 *  关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁。
 */


class  Number implements  Runnable{
    private int number=1;


    @Override
    public void run() {
        while (true){


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this) {
                notify();
                if (number<=100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+" "+number);
                    number++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }

        }
    }
}
public class CommunicationTest {

    public static void main(String[] args) {
        Number number=new Number();

        Thread t1= new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("线程一：");
        t2.setName("线程二：");
        t1.start();
        t2.start();

    }
}
