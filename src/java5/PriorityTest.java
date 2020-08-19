package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 20:08
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class PriorityTest extends Thread {

    //定义有参数的构造器，用于实例化线程指定name
    public PriorityTest(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<50;i++){
            //getName获取线程的name getPriority获取线程的优先级别
            System.out.println(getName()+",其优先级别"+getPriority()+"循环变量的值为："+i);

        }
    }


    public static void main(String[] args) {
        //改变主线程的优先级别
        Thread.currentThread().setPriority(6);

        for (int i=0;i<30;i++){
            if (i==10){
                PriorityTest low=new PriorityTest("低级:");
                low.start(); //启动线程
                System.out.println("创建之初的优先级："+low.getPriority());
                //指定线程优先级别为MIN_PRIORITY
                low.setPriority(MIN_PRIORITY);

            }

            if(i==20){
                PriorityTest high =new PriorityTest("高级：");
                high.start();
                System.out.println("创建之初优先级大"+high.getPriority());
                //指定线程优先级别为MAX_PRIORITY
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }




    }

}
