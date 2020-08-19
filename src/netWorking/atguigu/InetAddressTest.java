package netWorking.atguigu;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/12 0012
 * Time: 21:50
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class InetAddressTest {

    public static void main(String[] args) {
        try {
            InetAddress inet1=InetAddress.getByName("127.0.0.1");
            System.out.println(inet1);
            InetAddress inet2=InetAddress.getByName("www.bilibili.com");
            System.out.println(inet2);

            //获取本机地址
            InetAddress inet3=InetAddress.getLocalHost();
            System.out.println(inet3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
