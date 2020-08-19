package netWorking.atguigu;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/13 0013
 * Time: 22:06
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class URLTest {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://blog.csdn.net/tanga842428/article/details/52716875");

//            public String getProtocol(  )     获取该URL的协议名
            System.out.println(url.getProtocol());
//            public String getHost(  )           获取该URL的主机名
            System.out.println(url.getHost());
//            public String getPort(  )            获取该URL的端口号
            System.out.println(url.getPort());
//            public String getPath(  )           获取该URL的文件路径
            System.out.println(url.getPath());
//            public String getFile(  )             获取该URL的文件名
            System.out.println(url.getFile());
//            public String getQuery(   )        获取该URL的查询名
            System.out.println(url.getQuery());




        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
