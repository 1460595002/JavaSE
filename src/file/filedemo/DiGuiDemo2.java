package file.filedemo;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 08:32
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class DiGuiDemo2 {
    //����n�Ľ׳� ʹ�õݹ����
    public static void main(String[] args) {
       int n=3;

        System.out.println(getValue(n));
    }

    	/*
  	  ͨ���ݹ��㷨ʵ��.
  	  �����б�:int
  	  ����ֵ����: int
  	*/
    public static int getValue(int n){
        //1�Ľ׳�Ϊ1
        if (n==1){
            return 1;
        }
        return n*getValue(n-1);
    }
}
