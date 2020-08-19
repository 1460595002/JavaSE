package IO.file;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 14:20
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestFile1 {


    public static void main(String[] args) {
        File file=new File("D:\\idea\\IntelliJ IDEA 2019.3");
        //以字符串的形式，返回当前文件夹的所有的文件（不包含子文件与文件夹）
        file.list();
        //以文件数组的形式，返回当前文件夹下的所有的文件（不包含文件以及子文件夹）
        File[]files=file.listFiles();

        //以字符串形式返回所在文件节夹
        file.getParent();


        //以文件的形式返回获取所在文件夹
        file.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        file.mkdir();

        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        file.mkdirs();

        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
//       file.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        file.getParentFile().mkdirs();

        // 列出所有的盘符c: d: e: 等等
        file.listRoots();

        // 刪除文件
        file.delete();

        // JVM结束的时候，刪除文件，常用于临时文件的删除
        file.deleteOnExit();






    }
}
