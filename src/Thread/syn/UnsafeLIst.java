package Thread.syn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 21:59
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UnsafeLIst {

    public static void main(String[] args) {
        List<String> list =new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());//长度有时候不一致所以线程不安全
    }
}
