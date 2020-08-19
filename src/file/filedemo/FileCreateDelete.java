package file.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 07:38
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class FileCreateDelete {

    public static void main(String[] args) throws IOException {
        //�ļ��Ĵ���
        File f1  = new File("aaa.txt");
        System.out.println("�Ƿ����"+ f1.exists());//false
        System.out.println("�Ƿ񴴽�"+f1.createNewFile());
        System.out.println("�Ƿ����"+ f1.exists());//false

        //Ŀ¼�Ĵ���
        File f2 = new File("newDir");
        System.out.println("�Ƿ����"+f2.exists());//false
        System.out.println("�Ƿ񴴽�"+f2.mkdir());//true
        System.out.println("�Ƿ����"+f2.exists());//true

        //�����༯Ŀ¼
        File f3 = new File("newDira//newDira");
        System.out.println(f3.mkdir());//false mkdir()ֻ�ܴ���һ��Ŀ¼
        System.out.println(f3.mkdirs());//true �༶Ŀ¼�����ɹ���

        //�ļ�ɾ��
        System.out.println(f1.delete());
    }
}
