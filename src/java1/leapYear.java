package java1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/3 0003
 * Time: 20:08
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class leapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=scanner.nextInt();
        if (0==year%4&&0!=year%100||0==year%400){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }

    }
}
