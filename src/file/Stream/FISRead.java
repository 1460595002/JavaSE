package file.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 09:41
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FISRead {

    public static void main(String[] args) throws IOException {
        //ʹ���ļ�������������
        FileInputStream fis = new FileInputStream("data.txt");
        //��������������
        //ѭ������
        int len;
        while ((len=fis.read())!=-1){

            System.out.print((char) len);
        }
        fis.close();
    }
}
