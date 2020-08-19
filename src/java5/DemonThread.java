package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 19:13
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DemonThread extends Thread {

    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        DemonThread t1=new DemonThread();
        //将这个线程设置为后台线程

        t1.start();
        t1.sleep(1000);
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
