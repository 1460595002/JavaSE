package reflection.demo1;

import org.junit.Test;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/15 0015
 * Time: 08:51
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class NewInstanceTest {

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {

        Class<Person> personClass = Person.class;
       /*
        newInstance():调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参的构造器。

        要想此方法正常的创建运行时类的对象，要求：
        1.运行时类必须提供空参的构造器
        2.空参的构造器的访问权限得够。通常，设置为public。


        在javabean中要求提供一个public的空参构造器。原因：
        1.便于通过反射，创建运行时类的对象
        2.便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器

         */
        Person person = personClass.newInstance();
        System.out.println(person);

    }

    /**
     * 创建一个指定类的对象
     * classPath：指定类的全名
     */

    //体会反射的动态性
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        for (int i = 0; i <3 ; i++) {
            int num = new Random().nextInt(3);
            String classPath="";

            switch (num){
                case 0:
                    classPath="java.util.Date";
                    break;
                case 1:
                    classPath="java.lang.Object";
                    break;
                case 2:
                    classPath="reflection.demo1.Person";
                    break;

            }

            Object instance = getInstance(classPath);
            System.out.println(instance);
        }
    }


    //    创建一个指定类对象  classPath指定类的全名
    public Object getInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> name = Class.forName(classPath);
        return name.newInstance();

    }
}
