package file.filedemo;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/22 0022
 * Time: 08:32
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class DiGuiDemo2 {
    //计算n的阶乘 使用递归完成
    public static void main(String[] args) {
       int n=3;

        System.out.println(getValue(n));
    }

    	/*
  	  通过递归算法实现.
  	  参数列表:int
  	  返回值类型: int
  	*/
    public static int getValue(int n){
        //1的阶乘为1
        if (n==1){
            return 1;
        }
        return n*getValue(n-1);
    }
}
