package file.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 09:16
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FOSWrite {
    public static void main(String[] args) throws IOException {
        //ʹ���ļ�������������
        FileOutputStream fos = new FileOutputStream("fos.txt");

        byte[] b="���ڰ�".getBytes();
        fos. write(b);
        fos.close();


    }
}
