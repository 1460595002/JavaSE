package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 07:32
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FileIs {
    public static void main(String[] args) {
        File f = new File("d:\\aaa\\bbb.java");
        File f2 = new File("d:\\aaa");
        //�ж��Ƿ����
        System.out.println("d:\\aaa\\bbb.java�Ƿ����"+f.exists());
        System.out.println("d:\\aaa�Ƿ����"+f2.exists());
        //�ж����ļ�����Ŀ¼
        System.out.println("d:\\aaa���ļ���"+f2.isFile());
        System.out.println("d:\\aaa��Ŀ¼��"+f2.isDirectory());



    }
}
