package netWorking.atguigu;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/12 0012
 * Time: 22:17
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TCPTest1 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            //1.创建socket对象指明服务器端ip和端口号
            InetAddress inet = InetAddress.getByName("192.168.0.107");
            socket = new Socket(inet, 8989);
            //2.获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            os.write("你好我是客户端".getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //服务端
    @Test
    public void server(){
        ServerSocket ss=null;
        Socket socket=null;

        InputStream is=null;
        ByteArrayOutputStream baos=null;

        try {
            //1.创建服务端的serverSocket，指明端口号
            ss=new ServerSocket(8989);
            //2.调用accept()表示接受来自于客户端socket
            socket=ss.accept();

            //获取输入流
            is=socket.getInputStream();
            //不建议这样写可能会出现乱码
/*            byte [] buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer)) !=-1){
                String str=new String(buffer,0,len);
                System.out.println(str);
            }*/
            //4.读取输入流中的数据
            baos=new ByteArrayOutputStream();
            byte [] buffer=new byte[5];
            int len;
            while ((len=is.read(buffer)) !=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
            System.out.println("收到了来自于："+socket.getInetAddress().getHostAddress()+"的数据");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源

            if (baos !=null){
                //5.关闭资源
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (is !=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss !=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

