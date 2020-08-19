package file.filedemo;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 08:46
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class DiGuiDemo4 {
    public static void main(String[] args) {
// ����File����
        File dir  = new File("D:\\aaa");
        // ���ô�ӡĿ¼����
        printDir(dir);
    }

    public static void printDir(File dir){
        //��ȡ���ļ���Ŀ¼
        File[] files = dir.listFiles();

        //forѭ�����д�ӡ
        for (File file : files) {
            //������ļ��������·��
            if (file.isFile()){
                // ���ļ����ж��ļ���������ļ�����·��
                if (file.getName().endsWith(".java")) {
                    System.out.println("�ļ���:" + file.getAbsolutePath());
                }
            }else {
                //��Ŀ¼���������γɵݹ�
                printDir(file);
            }
        }
    }
}
