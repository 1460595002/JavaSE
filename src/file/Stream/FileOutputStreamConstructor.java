package file.Stream;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 09:09
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FileOutputStreamConstructor {

    public static void main(String[] args) throws FileNotFoundException {
        //使用File对象创建流
        File file = new File("a.txt");
        FileOutputStream fos  = new FileOutputStream(file);

        FileOutputStream fos1 = new FileOutputStream("b.txt");


    }
}
