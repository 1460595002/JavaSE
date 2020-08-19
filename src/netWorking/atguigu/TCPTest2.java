package netWorking.atguigu;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/13 0013
 * Time: 10:02
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TCPTest2 {

        /*
    这里涉及到的异常，应该使用try-catch-finally处理
     */
    //下面是为了更的测试
    @Test
    public void client() throws IOException {
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os=socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("手机.jpg"));


        byte [] buffer =new byte[1024];
        int len;
        while ((len= fis.read(buffer)) !=-1){
            os.write(buffer,0,len);
        }

        fis.close();
        os.close();
        socket.close();
    }

            /*
    这里涉及到的异常，应该使用try-catch-finally处理
     */
    //下面是为了更的测试
    @Test
    public void server() throws IOException {
        ServerSocket ss=new ServerSocket(9090);

        Socket socket=ss.accept();

        InputStream is=socket.getInputStream();

        FileOutputStream fos=new FileOutputStream(new File("手机2.jpg"));

        byte[] buffer=new byte[1024];
        int len;
        while ((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);

        }
        fos.close();
        is.close();
        ss.close();
    }
}
