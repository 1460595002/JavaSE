package java1;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/4/25 0025
 * Time: 11:07
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ForDemo {
    @Test
    public void For(){

        for (int j = 1; j <=9 ; j++) {
            for (int i = 1; i <= j; i++) {

                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }


    }
}
