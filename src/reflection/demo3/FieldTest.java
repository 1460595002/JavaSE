package reflection.demo3;

import org.junit.Test;
import reflection.demo2.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/15 0015
 * Time: 09:59
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class FieldTest {

    @Test
    public void test1(){
        Class<Person> personClass = Person.class;

        //获取属性结构
        //getFields()：获取当前运行时的类及父类声明public访问修饰符的属性
        Field[] fields = personClass.getFields();
        for (Field f :fields){
            System.out.println(f);
        }

        //getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    //访问修饰符 数据类型 变量名
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();

        for (Field f:declaredFields) {
            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers)+"\t");

            //2.数据类型
            Class<?> type = f.getType();
            System.out.println(type.getName()+"\t");

            //3.变量名
            String name = f.getName();
            System.out.println(name);
            System.out.println();
        }

    }
}
