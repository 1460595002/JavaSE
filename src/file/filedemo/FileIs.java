package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 07:32
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FileIs {
    public static void main(String[] args) {
        File f = new File("d:\\aaa\\bbb.java");
        File f2 = new File("d:\\aaa");
        //判断是否存在
        System.out.println("d:\\aaa\\bbb.java是否存在"+f.exists());
        System.out.println("d:\\aaa是否存在"+f2.exists());
        //判断是文件还是目录
        System.out.println("d:\\aaa是文件？"+f2.isFile());
        System.out.println("d:\\aaa是目录？"+f2.isDirectory());



    }
}
