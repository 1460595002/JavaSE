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
 * Time: 15:40
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TCPTest3 {

    /*
        这里涉及到的异常，应该使用try-catch-finally处理
         */

    @Test
    public void client() throws IOException {
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9090);

        OutputStream os=socket.getOutputStream();

        FileInputStream fis=new FileInputStream(new File("行李箱.jpg"));

        byte [] buffer=new byte[1024];

        int len;
        while ((len=fis.read(buffer)) !=-1){

            os.write(buffer,0,len);
        }

        //关闭数据输出
        socket.shutdownOutput();

        //接受来自服务端的数据，并显示到控制台上
        InputStream is=socket.getInputStream();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte [] buffeer =new byte[1024];

        int len1;

        while ((len1=is.read(buffeer)) !=-1){
            baos.write(buffeer,0,len1);
        }
        System.out.println(baos.toString());
        fis.close();
        os.close();
        socket.close();
        baos.close();
    }

    @Test
    public void server() throws Exception{
        ServerSocket ss=new ServerSocket(9090);
        //获取客户端传过来的socket
        Socket socket=ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos=new FileOutputStream(new File("行李箱2.jpg"));

        byte [] buffer=new byte[1024];
        int len;
        while ((len=is.read(buffer)) !=-1){
            fos.write(buffer,0,len);
        }
        System.out.println("图片传输完成！");

        //服务器给予客户端反馈
        OutputStream os=socket.getOutputStream();
        os.write("你好，图片已经收到了".getBytes());

        fos.close();
        is.close();
        socket.close();
        ss.close();
        os.close();
    }
}
