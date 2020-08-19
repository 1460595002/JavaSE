package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 11:11
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class StartDead extends Thread {
    private  int i;


   public StartDead (String name){
       super(name);
   }

    public void  run(){
       for (;i<50;i++){

           System.out.println(getName()+" "+i);
       }

    }

    public static void main(String[] args) throws InterruptedException {

           new StartDead("新的线程").start();

         for (int i=0;i<50;i++){
             if (i==20){
                 StartDead startDead=new StartDead("被join的线程");
                 startDead.start();
                 startDead.join();


             }
             System.out.println("被join线程"+Thread.currentThread().getName()+" "+i);
         }
    }




}
