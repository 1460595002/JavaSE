package Thread.state;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 10:33
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//测试join方法 可以想象为插队
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println("vip来了！"+i);
        }
    }


    public static void main(String[] args) {
        TestJoin join = new TestJoin();
        Thread vip = new Thread(join, "我们是vip");
        vip.start();

        for (int i = 0; i <500 ; i++) {
            //当i为500的时候vip的线程插队

           if (i==200){
               try {
                   vip.join();//插队
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
            System.out.println("main"+i);

        }

    }
}
