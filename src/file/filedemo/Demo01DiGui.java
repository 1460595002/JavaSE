package file.filedemo;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/22 0022
 * Time: 07:59
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class Demo01DiGui {
    /*
     * 3.���췽��,��ֹ�ݹ�
     * ���뱨��:���췽���Ǵ�������ʹ�õ�,�����ö���һֱ������ȥ
     */
    public Demo01DiGui() {
        //Demo01DiGui();
    }

    public static void main(String[] args) {
      b(500);
      a();//Exception in thread "main" java.lang.StackOverflowError
    }


    private static void b(int i){
//���һ���ݹ����������,i==5000��ʱ�����
        if (i==5000){

            return;//��������
        }
        System.out.println(i++);
        b(++i);
    }

    private static void a(){
        System.out.println("����a����");
        a();
    }
}
