package file.Stream;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 09:09
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FileOutputStreamConstructor {

    public static void main(String[] args) throws FileNotFoundException {
        //ʹ��File���󴴽���
        File file = new File("a.txt");
        FileOutputStream fos  = new FileOutputStream(file);

        FileOutputStream fos1 = new FileOutputStream("b.txt");


    }
}
