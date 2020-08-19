package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 08:46
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DiGuiDemo4 {
    public static void main(String[] args) {
// 创建File对象
        File dir  = new File("D:\\aaa");
        // 调用打印目录方法
        printDir(dir);
    }

    public static void printDir(File dir){
        //获取子文件和目录
        File[] files = dir.listFiles();

        //for循环进行打印
        for (File file : files) {
            //如果是文件输出绝对路径
            if (file.isFile()){
                // 是文件，判断文件名并输出文件绝对路径
                if (file.getName().endsWith(".java")) {
                    System.out.println("文件名:" + file.getAbsolutePath());
                }
            }else {
                //是目录继续遍历形成递归
                printDir(file);
            }
        }
    }
}
