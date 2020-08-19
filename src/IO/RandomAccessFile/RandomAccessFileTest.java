package IO.RandomAccessFile;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/3 0003
 * Time: 09:36
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class RandomAccessFileTest {
    @Test
    public void test1(){
        RandomAccessFile raf1=null;
        RandomAccessFile raf2=null;
     //r:输入   rw：输出
        try {
            raf1=new RandomAccessFile(new File("行李箱.jpg"),"r");
            raf2=new RandomAccessFile(new File("行李箱3.jpg"),"rw");

            //2.
            byte[] buffer=new byte[1024];
            int len;
            while ((len=raf1.read(buffer))!=-1){
                raf2.write(buffer,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (raf1 !=null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (raf2!=null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //使用RandomAccessFile实现文件内容替换
    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1=new RandomAccessFile("dbcp.txt","rw");
        raf1.seek(3);//将指针调到角标为3的位置
        raf1.write("jinronga".getBytes());
        raf1.close();
    }
    /*
    使用RandomAccessFile实现数据的插入效果
     */

    @Test
    public void test() throws IOException {
        RandomAccessFile raf1=new RandomAccessFile("data.txt","rw");
        raf1.seek(3);//将指针调到角标为3的位置
        //保存指针3后面的所有数据到StringBuilder中
        StringBuilder builder=new StringBuilder((int) new File("dbcp_gbk.txt").length());
        byte[] buffer=new byte[20];
        int len;
        while ((len=raf1.read(buffer))!=-1){
            builder.append(new String(buffer,0,len));
        }
        //调回指针，写入“xyz”
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        //将StringBuilder中的数据写入到文件中
        raf1.write(builder.toString().getBytes());
        raf1.close();
    }
}
