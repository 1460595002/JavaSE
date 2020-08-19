package netWorking.lesson;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/19 0019
 * Time: 22:04
 * E-mail:1460595002@qq.com
 * 类说明:
 */

//客户端
public class TcpClientDemo01 {
    public static void main(String[] args) {

     Socket socket=null;
        OutputStream os=null;
        try {
            //1.要知道服务器的地址
            InetAddress serverIP=InetAddress.getByName("127.0.0.1");
            int port=9999;
            //2.创建一个socket连接
            socket=new Socket(serverIP,port);

            //3.发送消息io流
            os=socket.getOutputStream();
             os.write("你好".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
