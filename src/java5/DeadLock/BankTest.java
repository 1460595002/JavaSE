package java5.DeadLock;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 17:15
 * E-mail:1460595002@qq.com
 * 类说明:使用同步监听器把单例模式的懒汉式改为线程安全
 */
public class BankTest {
}

class Bank{

    //构造方法私有化
    private  Bank(){

    }

    //创建静态私有对象
    private static Bank bank;


    //提供公共静态方法让外界进行访问
    public static   Bank getBank(){

//        //方法一效率慢
//        synchronized (Bank.class) {
//            if (bank == null) {
//                bank = new Bank();
//            }
//
//        }

        //方法二：效率更高
        if (bank==null){

            synchronized (Bank.class){
                if (bank==null){
                    bank=new Bank();
                }
            }


        }
        return bank;


    }









}
