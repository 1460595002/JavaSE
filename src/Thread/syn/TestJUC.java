package Thread.syn;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 22:42
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//测试juc安全类型的集合
public class TestJUC {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();

        new Thread(()->{
            for (int i = 0; i <10000 ; i++) {
                list.add(Thread.currentThread().getName());
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
