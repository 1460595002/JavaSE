package String.Debug;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/8 0008
 * Time: 13:26
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class IDEDebug {


    @Test
    public void testStringBuffer(){
        String str=null;
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);//“null”

        StringBuffer sb1=new StringBuffer(str);//空指针异常
        System.out.println(sb1);//






    }
}
