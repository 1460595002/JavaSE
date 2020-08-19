package Thread.syn;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 16:16
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//不安全买票
public class UnsafeBuyTicket {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的你们").start();
        new Thread(buyTicket,"可恶的黄牛党").start();
    }

}

class BuyTicket implements Runnable{

     //票
    private int ticketNums=10;
    boolean flag=true;
    @Override
    public void run() {
        //买票
        while (flag){
           buy();
        }
    }

    private  void buy(){
        //判断是否有票
        if (ticketNums<=0){
            flag=false;
            return;
        }
       //模拟延时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);

    }
}