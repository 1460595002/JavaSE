package java5.Account;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 21:40
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DrawThread extends Thread {

    //模拟账户
    private  Account account;
    //当前取钱线程所希望取钱金额
    private  double drawAmount;


    public DrawThread(String name,Account account, double drawAmount){
        super(name);
        this.account=account;
        this.drawAmount=drawAmount;
    }
    public void run(){
       account.draw(drawAmount);

    }
}
