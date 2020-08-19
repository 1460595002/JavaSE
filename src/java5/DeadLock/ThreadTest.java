package java5.DeadLock;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 16:17
 * E-mail:1460595002@qq.com
 * 类说明:死锁的演示
 */
public class ThreadTest {


    public static void main(String[] args) {

        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();

        new Thread(){

            @Override
            public void run() {
                synchronized (s1){
                    s1.append("a");
                    s2.append("1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }

            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                 synchronized (s2){
                     s1.append("c");
                     s2.append("3");
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     synchronized (s1){
                         s1.append("d");
                         s2.append("4");
                         System.out.println(s1);
                         System.out.println(s2);
                     }
                 }
            }
        }).start();

    }

}
