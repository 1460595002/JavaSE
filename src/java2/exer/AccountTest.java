package java2.exer;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/3 0003
 * Time: 16:17
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class AccountTest {
    public static void main(String[] args) {


        Account acct1 =  new Account();
        Account acct2 =  new Account("qwerty",2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(acct1);
        System.out.println(acct2);

        System.out.println(acct1.getInterestRate());
        System.out.println(acct1.getMinMoney());



    }

}
