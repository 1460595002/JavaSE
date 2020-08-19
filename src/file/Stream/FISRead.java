package file.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 09:41
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FISRead {

    public static void main(String[] args) throws IOException {
        //使用文件名创建流对象
        FileInputStream fis = new FileInputStream("data.txt");
        //定变量保存数据
        //循环读出
        int len;
        while ((len=fis.read())!=-1){

            System.out.print((char) len);
        }
        fis.close();
    }
}
