package file.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 07:38
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FileCreateDelete {

    public static void main(String[] args) throws IOException {
        //文件的创建
        File f1  = new File("aaa.txt");
        System.out.println("是否存在"+ f1.exists());//false
        System.out.println("是否创建"+f1.createNewFile());
        System.out.println("是否存在"+ f1.exists());//false

        //目录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在"+f2.exists());//false
        System.out.println("是否创建"+f2.mkdir());//true
        System.out.println("是否存在"+f2.exists());//true

        //创建多集目录
        File f3 = new File("newDira//newDira");
        System.out.println(f3.mkdir());//false mkdir()只能创建一级目录
        System.out.println(f3.mkdirs());//true 多级目录创建成功了

        //文件删除
        System.out.println(f1.delete());
    }
}
