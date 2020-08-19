package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 09:15
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FirstThread extends Thread{

    private int i;

    @Override
    public void run() {
        for(;i<100;i++){
            //当线程继承Thread类时：直接使用this即可获取当前线程
            //getname直接获取线程的名字
           System.out.println(getName()+" "+i);
        }
    }


    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            //通过Thread().getName获取当前线程的名字
            System.out.println("更改名字：");
            Thread.currentThread().setName("Thread22222");
            System.out.println(Thread.currentThread().getName()+" "+i);

            //执行到线程20的时候就创建两个并启动
            if(i==20){

               new FirstThread().start();
               new FirstThread().start();

            }
        }
    }

}
