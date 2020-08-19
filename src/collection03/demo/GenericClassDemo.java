package collection03.demo;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 14:42
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class GenericClassDemo {

    public static void main(String[] args) {
        MyGenericClass<String> my = new MyGenericClass<String>();

        //调用set mvp
        my.setMvp("大胡子渣渣");
        System.out.println(my.getMvp());

        //创建一个泛型Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<>();

        my2.setMvp(12);

        System.out.println(my2.getMvp());

    }

}
