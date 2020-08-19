package String.exer;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/7 0007
 * Time: 21:47
 * E-mail:1460595002@qq.com
 * 类说明:面试题
 */
public class StringTest {

    String s=new String("good");

    char[] ch={'t','e','s','t'};

    public void change(String s,char[] ch){
        s="test ol";
        ch[0]='b';


    }

    public static void main(String[] args) {
        StringTest stringTest=new StringTest();
        stringTest.change(stringTest.s,stringTest.ch);
        System.out.println(stringTest.s);//good
        System.out.println(stringTest.ch);//best
    }




}
