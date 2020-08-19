package java5.Account;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 21:51
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DrawTest {


    public static void main(String[] args) {
       //初始化卡号，账户余额
       Account a=new Account("444",10000);

       //取钱的用户两个线程同时对同一账户取钱
       new DrawThread("甲：",a,589).start();
       new DrawThread("乙：",a,69).start();






    }
}
