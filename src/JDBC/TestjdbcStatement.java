package JDBC;

import org.junit.Test;

import java.sql.*;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/18 0018
 * Time: 10:08
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestjdbcStatement {

    //添加
    @Test
    public void test(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/how2java?characterEncoding=UTF-8","root","1460595002");
                //Statement执行上去了的对象
                Statement statement=connection.createStatement();



                ) {
            String sql="insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";

            statement.executeUpdate(sql);
            System.out.println("插入成功！"+sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //修改
    @Test
    public void test1(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/how2java?characterEncoding=UTF-8","root","1460595002");
                //Statement执行上去了的对象
                Statement statement=connection.createStatement();



        ) {
            String sql="update hero set `name`='盖伦',`hp`=500 where id=2";

            statement.executeUpdate(sql);
            System.out.println("修改成功！"+sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    //删除
    @Test
    public void test2(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/how2java?characterEncoding=UTF-8","root","1460595002");
                //Statement执行上去了的对象
                Statement statement=connection.createStatement();



        ) {
            String sql="delete FROM hero where id=7";

            statement.executeUpdate(sql);
            System.out.println("修改成功！"+sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //分别使用
    @Test
    public void test3(){

        long start=0L;
        long end=0L;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(
                Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/how2java?characterEncoding=UTF-8","root","1460595002");
                //Statement执行上去了的对象
                Statement statement=connection.createStatement();

                //

        ) {
            start =  System.currentTimeMillis();
            for (int i=0;i<1000;i++){
                String sql="insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
                statement.executeUpdate(sql);
            }
            end=System.currentTimeMillis();
            System.out.println(" Statement使用的时间为:"+(end-start));

            String sql="insert into hero values(null,?,?,?)";

            PreparedStatement ps=connection.prepareStatement(sql);

            start =  System.currentTimeMillis();
            for(int i=0;i<1000;i++){
               ps.setString(1,"盖伦");
               ps.setFloat(2,565);
               ps.setInt(3,854);
            }
            end=System.currentTimeMillis();
            System.out.println("  PreparedStatement使用的时间为:"+(end-start));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
