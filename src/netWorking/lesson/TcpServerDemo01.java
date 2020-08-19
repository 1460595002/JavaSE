package netWorking.lesson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/19 0019
 * Time: 22:05
 * E-mail:1460595002@qq.com
 * 类说明:
 */

//服务端
public class TcpServerDemo01 {

    public static void main(String[] args) {
        ServerSocket socket=null;
        Socket accept =null;
        InputStream inputStream=null;
        ByteArrayOutputStream baos;
        try {
            //1.我得有一个地址
             socket = new ServerSocket(999);
            //2.等待客户端的连接过来
           accept = socket.accept();
            //3.读取客户端的消息
            inputStream = accept.getInputStream();

            //管道流
            baos=new ByteArrayOutputStream();

            byte[] buffer= new byte[1024];
            int len;
            while ((len=inputStream.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }
    }

}
