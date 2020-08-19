package IO.file.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/20 0020
 * Time: 14:51
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Test2 {

    public static void main(String[] args) {

        try {
            FileInputStream in=new FileInputStream("E:\\1111.txt");
            int len=0;
             byte[] n=new byte[100];//设置一个byte数组接收传文件的内容
//              in.read(n);  //in.read方法有一个返回值，读取数据的长度

         while ((len=in.read(n))!=-1){

         }



            System.out.println(new String(n));

              in.close();//关闭流

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
