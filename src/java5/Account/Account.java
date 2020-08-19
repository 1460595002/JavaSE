package java5.Account;

import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/4 0004
 * Time: 21:30
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Account {

    private final ReentrantLock lock=new ReentrantLock();

    //封装编号，账户余额的两个成员变量
    private String accountNo;
    private double balance;

    public Account(String accountNo ,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public  void draw(double drawAmount){
            //加锁
            lock.lock();
            try {


            //当取钱的金额小于当前余额时候
            if (balance>=drawAmount) {
                System.out.println("取钱成功！取钱金额为：" + drawAmount);
                try {
                  Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //减去余额
              balance-=drawAmount;
                System.out.println("余额为："+balance);
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱金额大于您的账户余额!");
            }
            }finally {
                lock.unlock();//释放锁
            }
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 &&
                accountNo.equals(account.accountNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }
}
