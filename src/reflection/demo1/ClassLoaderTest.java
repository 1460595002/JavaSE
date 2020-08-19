package reflection.demo1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/14 0014
 * Time: 17:08
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class ClassLoaderTest {


    @Test
    public void test1(){
        //对于自定义类，使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //调用系统类加载器的getParen():获取扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        //调用扩展类加载器的getParen():无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类的。
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);

    }

        /*
    Properties：用来读取配置文件。

     */
    @Test
    public void test2() throws IOException {
        Properties pros=new Properties();
        //此时的文件默认在当前的model下
        //读取配置文件一：
        FileInputStream fis=new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc1.properties");
         pros.load(fis);

         //读取配置文件的方式二：使用ClassLoder
        //配置文件默认识别为：当前module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(resourceAsStream);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user + ",password = " + password);
    }
}
