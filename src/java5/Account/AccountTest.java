package java5.Account;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/5 0005
 * Time: 21:07
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//账户类
class  Account1 {
    private double balance;


    //存钱
    public synchronized void  deposit(double amt) {
        if (amt>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"：往账户存钱1000，现在余额是："+balance);
        }


    }
}
//用户类
class Customer extends Thread{
       private Account1 account1;

       public Customer(Account1 account1){
           this.account1=account1;
       }

    @Override
    public void run() {
        for (int i=0;i<3;i++){
            account1.deposit(1000);

        }
    }
}

public class AccountTest {

    public static void main(String[] args) {

        Account1 account=new Account1();
        Customer customer=new Customer(account);
        Customer customer2=new Customer(account);
        customer.setName("甲：");
        customer2.setName("乙：");
        customer.start();
        customer2.start();


    }
}
