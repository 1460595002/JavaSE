package file.Stream;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 09:51
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FISRead2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis  = new FileInputStream("");//文件中内容

        int len;
        //循环读取
        byte[] b = new byte[2];
        while ((len=fis.read(b))!=-1){
            System.out.println(new String());
        }
        fis.close();
    }
}
