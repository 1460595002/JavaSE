package IO.file.test;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/20 0020
 * Time: 12:53
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Test {

    public static void main(String[] args) {
        File f=new File("E:\\111.txt");



        //获取文件名字
        System.out.println(f.getName());
        //获取路径
        System.out.println(f.getPath());
        //获取文件最后的修改时间，返回一个毫秒数
        System.out.println(f.lastModified());


        File f2=new File("E:\\112.txt");
        //判断文件是否存在，如果不存在就创建
        System.out.println(f2.exists());
        if(!f2.exists()){
            try {
                f2.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(f2.exists());

        //删除文件
        f2.delete();





    }
}
