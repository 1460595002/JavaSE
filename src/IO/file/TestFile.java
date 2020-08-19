package IO.file;

import java.io.File;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 14:10
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestFile {
    public static void main(String[] args) {


        File f=new File("D:\\idea\\IntelliJ IDEA 2019.3");
        System.out.println("当前文件夹是："+f);

        //文件是否存在
        System.out.println("判断文件是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());
        //文件的长度
        System.out.println("获取文件长度："+f.length());

        //文件最后修改的时间
        long time =f.lastModified();
        Date date=new Date(time);
        System.out.println("获取文件最后修改的时间："+date);
        f.setLastModified(54545454);


        //文件重名
        File f2=new File("d");
        f.renameTo(f2);





    }
}
