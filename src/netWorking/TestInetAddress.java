package netWorking;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/19 0019
 * Time: 20:38
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestInetAddress {

    @Test
    public void test(){

        try {
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            System.out.println(byName);


            InetAddress byName1 = InetAddress.getByName("www.bilibili.com");
            //常用的方法
            System.out.println(byName1);
            System.out.println(byName1.getAddress());//返回字符数组
            System.out.println(byName1.getCanonicalHostName());//规范名字
            System.out.println(byName1.getHostAddress()); //ip
            System.out.println(byName1.getHostName());//域名，或者自己电脑的名字


            InetAddress byName2 = InetAddress.getLocalHost();
            System.out.println(byName2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }

}
