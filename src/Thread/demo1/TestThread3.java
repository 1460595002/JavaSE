package Thread.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/16 0016
 * Time: 16:53
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//创建线程方式2：实现Runnable接口，重写run方法，执行线程需要丢入Thread中
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            System.out.println("我在学习java呢"+i);
        }
    }

    public static void main(String[] args) {


        TestThread3 t1 = new TestThread3();
        //执行线程
        new Thread(t1).start();


        for (int i = 0; i <1000 ; i++) {
            System.out.println("我在看bilibili呢"+i);
        }
    }
}
