package Thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 09:38
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//模拟网络延时
public class TestSleep2 {

    public static void main(String[] args) throws InterruptedException {
        //打印当前的系统时间
        Date date = new Date(System.currentTimeMillis());
        int num=10;
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());//更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
            if (num==0){
             break;
            }
        }


    }

    //模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num=10;

        while (true){
            Thread.sleep(1000);//每一秒执行一下
            System.out.println(num--);

            if (num==0){ //num等于0结束
                break;
            }
        }
    }
}
