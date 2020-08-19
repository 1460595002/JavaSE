package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 07:52
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FileFor {
    public static void main(String[] args) {
        File f1  = new File("D:\\");
        String[] list = f1.list();

        for (String name : list) {
            System.out.println(name);
        }

        File[] files = f1.listFiles();
        for (File name : files) {
            System.out.println(name);
        }
    }
}
