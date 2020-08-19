package java5;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 19:35
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class YileldTest extends  Thread {
    public  YileldTest(String name){
        super(name);

    }


    public void run(){
        for (int i=0;i<50;i++){
            System.out.println(getName()+" "+i);

            //当i等于20的时候使用yield方法让当前线程让步
            if (i==20){

                Thread.yield();
            }
        }
    }


    public static void main(String[] args) {
        //启动两个并发线程
        YileldTest yt1 =new YileldTest("高级");
        yt1.start();
        yt1.setPriority(Thread.MAX_PRIORITY);

        YileldTest yt2=new YileldTest("低级");
        yt2.start();
        yt2.setPriority(Thread.MIN_PRIORITY);

    }
}
