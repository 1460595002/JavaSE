package Thread.state;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 14:40
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//测试线程的优先级
public class TestPriority{
    public static void main(String[] args) {
        //主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"--==--"+Thread.currentThread().getPriority());

        Mypriority mypriority = new Mypriority();

        Thread t1 = new Thread(mypriority);
        Thread t2 = new Thread(mypriority);
        Thread t3 = new Thread(mypriority);
        Thread t4 = new Thread(mypriority);
        Thread t5 = new Thread(mypriority);
        Thread t6 = new Thread(mypriority);

        //设置优先级，在启动
        t1.start();
        t2.setPriority(1);
        t2.start();

        t3.setPriority(4);
        t3.start();
        t4.setPriority(Thread.MAX_PRIORITY);
        t4.start();
    }

}

class Mypriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--===--"+Thread.currentThread().getPriority());
    }
}