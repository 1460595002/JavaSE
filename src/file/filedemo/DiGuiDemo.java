package file.filedemo;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 08:07
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class DiGuiDemo {
    public static void main(String[] args) {
         //����1-num�ĺͣ�ʹ�õݹ����
        int num=5;
        //������͵ķ���
        getSum(5);
        System.out.println(getSum(5));
    }

    //ͨ���ݹ��㷨ʵ�� �����б� int ����ֵ����
    public static int getSum(int sum){
        //numΪ1ʱ������1 �൱һ�����ĳ��� num���е���1��ʱ��

     if (sum==1){
         return 1;//����1�൱�ڽ�������
     }

     return sum=sum+getSum(sum-1);

    }


}
