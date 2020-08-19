package IO.test1.exer;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/12 0012
 * Time: 09:21
 * E-mail:1460595002@qq.com
 * 类说明:
 *
 * 处理流之一：缓存流的使用
 * 1.缓存流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 * 2.作用：提供流的读取，写入的速度
 *    提高读写的速度的原因：内部提供了一个缓存区
 *    3.处理流，就是”套接“在已有的流的基础上
 */
public class BufferedTest {

//    实现非文本复制
    @Test
    public void BufferedStreamTest(){
        BufferedInputStream bis=null;

        BufferedOutputStream bos=null;

        try {
            //1.造文件
            File srcFile=new File("手机.jpg");
            File destFile=new File("手机3.jpg");
            //2.造流
            //2.1造节点流
            FileInputStream fis=new FileInputStream((srcFile));
            FileOutputStream fos=new FileOutputStream((destFile));
            //2.2造缓存流
            bis=new BufferedInputStream(fis);
            bos=new BufferedOutputStream(fos);

            //3.复制的细节：读取、写入
            byte[] buffer=new byte[10];
            int len;//记录长度
            while ((len=bis.read(buffer))!=-1){

                bos.write(buffer,0,len);

                bos.flush();//刷新缓存区
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //资源关闭
            //先关外层流，在关闭内层流
            if (bos !=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bis !=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.
//        fos.close();
//        fis.close();
    }


    //    使用BuffereReader 和BufferedWriter实现文本文件的赋值

    @Test
    public void testBufferedReaderBufferedWriter(){
        BufferedReader br=null;
        BufferedWriter bw=null;

        try {
            //创建文件和相应的流
            br=new BufferedReader(new FileReader("dbcp.txt"));
            bw=new BufferedWriter(new FileWriter("dbcp1.txt"));

            char [] buffer= new char[1024];
            int len;
            while ((len=br.read(buffer)) != -1){
                bw.write(buffer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源吧
            if (br !=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bw !=null){
                    try {
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
