package Thread.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/16 0016
 * Time: 20:17
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//多个线程同时操作同一个对象
//抢火车票的例子
public class TestThread4 implements Runnable{

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
        TestThread4 t1=new TestThread4();

        new Thread(t1,"小明").start();
        new Thread(t1,"小红").start();
        new Thread(t1,"小龙").start();
        new Thread(t1,"黄牛").start();
    }
}
