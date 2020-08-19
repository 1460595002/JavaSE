package IO.test1.exer;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/11 0011
 * Time: 14:38
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FileInputOutputStreamTest {

    //使用字节流FileInputStream处理文件，可能出现乱码
    @Test
    public void testFileInputStream(){
        FileInputStream fis=null;

        try {
            //1.造文件
            File file=new File("test.text");

            //2.造流
            fis=new FileInputStream(file);

            //3.读数据
            byte [] buffer =new byte[5];
            int len;//每次读取记录读取字节的个数
            while ((len=fis.read(buffer))!=-1){
                String str=new String(buffer,0,len);
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis !=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
