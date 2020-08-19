package java4;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/3 0003
 * Time: 22:28
 * E-mail:1460595002@qq.com
 * 类说明:代理模式二实例
 */
public class StaticProxyTest {

    public static void main(String[] args) {
           Proxy proxy=new Proxy(new RealStar());
           proxy.sing();
    }
}

interface Star{

    void confer();//面谈
    void signContract();//签合同
    void bookTicket();//订机票
    void sing();//唱歌
    void collectMonek();

}

//被代理类  歌星
class  RealStar implements Star{

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
     System.out.println("歌星在唱歌！");
    }

    @Override
    public void collectMonek() {

    }
}

//代理类  经纪人
class  Proxy implements  Star{

    private Star star;

    public Proxy(Star star){
        this.star=star;
    }

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
     star.sing();
     proxy();
    }

    public  void proxy(){
        System.out.println("我是经纪人：");

    }
    @Override
    public void collectMonek() {
    System.out.println("经纪人收钱");

    }
}