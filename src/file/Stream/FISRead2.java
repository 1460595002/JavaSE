package file.Stream;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 09:51
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FISRead2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("");//�ļ�������

        int len;
        //ѭ����ȡ
        byte[] b = new byte[2];
        while ((len=fis.read(b))!=-1){
            System.out.println(new String());
        }
        fis.close();
    }
}
