package collection02.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/5/10 0010
 * Time: 15:55
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MapTest {
    //Properties：常用来处理配置文件。key和value都是String类型的
    public static void main(String[] args) {
        FileInputStream fis=null;


        try {
            Properties pro=new Properties();
           fis= new FileInputStream("jdbc.properties");
            pro.load(fis);//加载对应的文件

            String name=pro.getProperty("name");
            String password = pro.getProperty("password");
            System.out.println("name = " + name + ", password = " + password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis !=null){
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
    }
}
