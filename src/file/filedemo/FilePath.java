package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 07:28
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FilePath {

    public static void main(String[] args) {
        //D���µ�nn.java �ļ�
        File file = new File("D://nn.java");
        System.out.println(file.getAbsolutePath());

        //��Ŀ�µ�bbb.java �ļ�
        File file1 = new File("bbb.java");
        System.out.println(file1.getAbsolutePath());


    }
}
