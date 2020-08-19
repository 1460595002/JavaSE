package Thread.state;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 10:11
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//测试礼让的线程
//礼让不一定成功，看cpu心情
public class TestYield {
    public static void main(String[] args) {

        MyYield myYield = new MyYield();

        new Thread(myYield,"a线程").start();
        new Thread(myYield,"b线程").start();
    }

}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行...");
       Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"正在执行...");

    }
}
