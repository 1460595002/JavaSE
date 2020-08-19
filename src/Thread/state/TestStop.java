package Thread.state;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 09:06
 * E-mail:1460595002@qq.com
 * 类说明:
 */

//测试stop
//1.建议现场正常停止---->利用次数，不建议以死循环
//2.建议使用标识位--->设置一个标识位置
//3.不使用stop或者destroy等过时方法或者jdk不建议的方法
public class TestStop implements Runnable{

    private  volatile Boolean flag =true;
    @Override
    public void run() {
         int i=0;
         while (flag){
             System.out.println("run...Thread"+i++);
         }
    }

    //2.设置一个公开的线程停止。转换标志位
    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop stop = new TestStop();

        new Thread(stop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if (i==900){
                stop.stop();
                System.out.println("线程该停止了！");
            }
        }

    }
}
