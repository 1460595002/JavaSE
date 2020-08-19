package java5.DeadLock;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 16:54
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//死锁的演示
class  A{
    public synchronized void foo(B b){ //同步监听器  A类的对象：a
        System.out.println("当前线程名字："+Thread.currentThread().getName()+"进入了foo方法");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("当前线程名字："+Thread.currentThread().getName()+"企图调用b类的last方法");
        b.last();

    }
    public synchronized void last(){//同步监视器：A类的对象：a
        System.out.println("进入B类last方法内部");
    }
}

class B{
    public  synchronized void bar(A a){//同步监视器：b
        System.out.println("当前线程的名字："+Thread.currentThread().getName()+"进入B类的bar方法");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //调用a类的last方法
        a.last();
    }


    public synchronized void last(){//同步监视器：b
        System.out.println("进入B类last方法内部");
    }

}
public class DeadLock implements Runnable {
      A a=new A();
      B b=new B();

    public  void  init(){
        Thread.currentThread().setName("主线程");
        // 调用a对象的foo方法
        a.foo(b);
        System.out.println("进入主线程之后：");


    }
    @Override
    public void run() {
        Thread.currentThread().setName("副线程：");
        // 调用b对象的bar方法
        b.bar(a);
        System.out.println("进入副线程之后：");
    }


    public static void main(String[] args) {
        DeadLock d1=new DeadLock();
        new Thread(d1).start();

        d1.init();



    }

}
