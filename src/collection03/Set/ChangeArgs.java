package collection03.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/6/20 0020
 * Time: 10:19
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
public class ChangeArgs {

    public static void main(String[] args) {
        int [] arr={1,4,62,431,2};
        int sum = getSum(arr);

        int sum1 = getSum(1, 5, 4, 8, 5, 845 );
        System.out.println(sum1);


    }

/*    public static int getSum(int[] arr){
        int sum=0;
        for (int a: arr){
            sum+=a;
        }
        return sum;
    }*/

    //�ɱ����д��
    public static int getSum(int... arr){
        int sum=0;

        for (int a : arr) {
            sum+=a;
        }
        return sum;
    }
}
