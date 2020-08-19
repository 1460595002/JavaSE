package IO.file;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 14:30
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestFile2 {
    public static void main(String[] args) {
        File file=new File("C:\\Windows");
      file.list();
        System.out.println("文件"+file.list().toString());

    }
}
