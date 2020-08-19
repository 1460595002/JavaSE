package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 07:28
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FilePath {

    public static void main(String[] args) {
        //D盘下的nn.java 文件
        File file = new File("D://nn.java");
        System.out.println(file.getAbsolutePath());

        //项目下的bbb.java 文件
        File file1 = new File("bbb.java");
        System.out.println(file1.getAbsolutePath());


    }
}
