package file.filedemo;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 08:07
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DiGuiDemo {
    public static void main(String[] args) {
         //计算1-num的和，使用递归完成
        int num=5;
        //调用求和的方法
        getSum(5);
        System.out.println(getSum(5));
    }

    //通过递归算法实现 参数列表 int 返回值类型
    public static int getSum(int sum){
        //num为1时，返回1 相当一方法的出口 num总有等于1的时候

     if (sum==1){
         return 1;//返回1相当于结束程序
     }

     return sum=sum+getSum(sum-1);

    }


}
