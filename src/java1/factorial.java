package java1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/3 0003
 * Time: 20:29
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
           int fac=1;
        while (num>1){
          fac*=num;

          num--;
        }
        System.out.println(fac);
    }
}
