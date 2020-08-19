package IO.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 14:42
 * E-mail:1460595002@qq.com
 * 类说明:文件输入流
 * 比如读取文件的数据到程序中，站在程序的角度来看，就叫做输入流
 * 输入流： InputStream
 * 输出流：OutputStream
 *
 */
public class TestStream {


    public static void main(String[] args) {

        try {
            File file=new File("D:\\guge\\test.txt");
            //创建文件输入流
            FileInputStream fis=new FileInputStream(file);
            //通过输入流就可以把硬盘的数据，读到内存中去
               //文件输出流
            FileOutputStream file1 =new FileOutputStream(file);
            //通过这个输出流就可以把数据从内存中输出到文件上
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
