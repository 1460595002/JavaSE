package Thread.demo1;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/17 0017
 * Time: 07:54
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//实现静态代理模式
public class StacticProxy {

    public static void main(String[] args) {
        //创建静态代理类传入帧数角色
        WddingCompany wddingCompany = new WddingCompany(new You());//传入真实角色
        wddingCompany.HappyMarry();
    }

}

interface Marry{
    //结婚
    void HappyMarry();
}
//真实角色你要结婚
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("我要结婚了！，好开心！");
    }
}
//代理角色，布置婚场公司
class WddingCompany implements Marry{

    private Marry marry;

    public WddingCompany(Marry marry) {
        this.marry = marry;
    }

    @Override
    public void HappyMarry() {
      marry.HappyMarry();
      showHappMarry();
      money();
    }

    public void showHappMarry(){
        System.out.println("布置现场！");
    }
    public void money(){
        System.out.println("收取中介费！");
    }
}