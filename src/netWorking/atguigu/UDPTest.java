package netWorking.atguigu;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/13 0013
 * Time: 20:21
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class UDPTest {

    @Test
    public void sender() throws IOException {

        DatagramSocket socket=new DatagramSocket();

        String str="以UDP方式进行发送！";
        byte [] data=str.getBytes();
        InetAddress inet=InetAddress.getLocalHost();
        DatagramPacket packet=new DatagramPacket(data,0,data.length,inet,9090);

        socket.send(packet);//发送数据包
        socket.close();

    }

    @Test
    public void reveiver() throws IOException {
        DatagramSocket socket =new DatagramSocket(9090);

        byte [] buffer=new byte[100];
        DatagramPacket packet =new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);

        System.out.println(new String(packet.getData(),0,packet.getLength()));

        socket.close();
    }
}
