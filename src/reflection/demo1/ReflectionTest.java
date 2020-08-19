package reflection.demo1;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/14 0014
 * Time: 15:10
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ReflectionTest {
    //反射之前对Person对象的操作

    @Test
    public void test1(){
        //1.创建Person对象
        Person person = new Person("喜洋洋",10);
        //2.通过对象，调用其内部的属性、方法
        person.age=10;

        System.out.println(person.toString());
        person.show();
        //在Person类外部，不可以通过Person类的对象调用其内部私有结构。
        //比如：name、showNation()以及私有的构造器
    }

    //反射之后 对于Person的操作
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class<Person> personClass = Person.class;
        //1.通过反射创建Person类的对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person tom = constructor.newInstance("Tom", 12);
        System.out.println(tom.toString());

        //2.通过反射调用指定的属性和方法
        //调用属性
        Field age = personClass.getDeclaredField("age");
        age.set(tom,10);
        System.out.println(tom.toString());

        //调用方法
        Method show =personClass.getDeclaredMethod("show");
        show.invoke(tom);


        System.out.println("===================");

        //通过反射，可以调用Person类的私有结构的构造。比如：私有的构造器，方法属性
        //调用私有的构造器
        Constructor<Person> constructor1 = personClass.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);//关闭检查模式可以private的方法
        Person jerry = constructor1.newInstance("Jerry");
        System.out.println(jerry);

        //调用私有的属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);//关闭检查模式可以private的属性
        name.set(jerry,"Hanmeimei");
        System.out.println(jerry);

        //调用私有的方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);//关闭检查模式可以private方法
         showNation.invoke(jerry,"中国");//相当于String nation = p1.showNation("中国")
        System.out.println(showNation);
    }
    //获取Class的实例的方式（前三种方式需要掌握）
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一：调用运行时类的属性：class
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        //方式二：通过运行时类的对象，调用getClass()
        Person person = new Person();
        Class<? extends Person> personClass2 = person.getClass();
        System.out.println(personClass2);

        //方式三：调用Class的静态方法：forName(String classPath)
        Class<?> personClass3 = Class.forName("reflection.demo1.Person");

        System.out.println(personClass3);

        System.out.println(personClass==personClass2);
        System.out.println(personClass==personClass3);
    }
    //万事万物皆对象？对象.xxx,File,URL,反射,前端、数据库操作
    //Class实例可以是哪些结构的说明：
    @Test
    public void test4(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要数组的元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);

    }


}
