package java1;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/20 0020
 * Time: 15:57
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class HeapDemo1 {

    public static void main(String[] args) {
        String str="hello";

        while (true){
            // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
            str+=str+new Random().nextInt(88888888)+new Random().nextInt(99999999);
        }
        //        byte[] bytes = new byte[40 * 1024 * 1024];
    }
}
