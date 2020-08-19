package IO.file;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 14:03
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestIo {

    public static void main(String[] args) {
        File file=new File("D:\\idea\\IntelliJ IDEA 2019.3");
        System.out.println("file的绝对路径："+file.getAbsolutePath());

        //相对路径，相当于工作的目录，如果在idea就是项目的目录

        File file1=new File("java5");
        System.out.println("file1的绝对路劲："+file1.getAbsolutePath());


        //把file作为父路径创建文件的对象
        File f3=new File(file,"javase");
        System.out.println("f3的绝对路劲："+f3.getAbsolutePath());


    }
}
