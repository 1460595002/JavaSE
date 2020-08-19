package java4;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/3 0003
 * Time: 22:13
 * E-mail:1460595002@qq.com
 * 类说明:代理模式
 */
public class NetWortTest {

    public static void main(String[] args) {
             Server server=new Server();
//             server.browse();
             PoxServer poxServer=new PoxServer(server);
             poxServer.browse();

    }
}
interface  NetWork{
    public void browse();
}


class  Server implements  NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器网络！");
    }
}

class PoxServer implements NetWork{

    private NetWork netWork;

    public PoxServer(NetWork netWork){
        this.netWork=netWork;
    }

   public  void df(){
       System.out.println("我是代理的服务器！");
   }


    @Override
    public void browse() {
//        df();
        netWork.browse();
    }
}
