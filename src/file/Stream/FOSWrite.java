package file.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 09:16
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        //使用文件名创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");

        byte[] b="金融啊".getBytes();
        fos. write(b);
        fos.close();


    }
}
