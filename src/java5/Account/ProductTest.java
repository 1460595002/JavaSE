package java5.Account;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/6 0006
 * Time: 10:56
 * E-mail:1460595002@qq.com
 * 类说明:
 *
 * 线程通信的应用：经典例题：生产者/消费者问题
 *
 *  生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 *  店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员
 *  会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品
 *  了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 *
 *  分析：
 *  1. 是否是多线程问题？是，生产者线程，消费者线程
 *  2. 是否有共享数据？是，店员（或产品）
 *  3. 如何解决线程的安全问题？同步机制,有三种方法
 *  4. 是否涉及线程的通信？是
 */

class Clerk{


private  int productCount=0;
//生产产品
    public synchronized void produceProduct(){

        if (productCount<20){
            System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount+"产品");
            productCount++;
    notify();

        }else {
           //加锁
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    //消费产品
    public synchronized void consumerProduct(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (productCount>0){
            System.out.println(Thread.currentThread().getName()+"消费出"+productCount+"产品");
            productCount--;

       notify();
        }else {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}

class Product extends Thread{//生产者
    private  Clerk clerk;
    public Product(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
     System.out.println(getName()+"开始生产产品");
        while (true){
            try {
                sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            clerk.produceProduct();
        }

    }
}
class Consumer extends  Thread{//消费者
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {//消费者
        System.out.println(getName()+"消费产品");
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            clerk.consumerProduct();
        }

    }
}
public class ProductTest {


    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Product product=new Product(clerk);
         Consumer consumer=new Consumer(clerk);
        Consumer consumer1=new Consumer(clerk);
         product.setName("生产者：");
        consumer.setName("消费者1：");
        consumer1.setName("消费者2：");
        product.start();
        consumer.start();
        consumer1.start();


    }
}
