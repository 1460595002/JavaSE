package JDBC.exer.orm;

import JDBC.exer.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.chrono.HijrahEra;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/19 0019
 * Time: 22:55
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class TestJdbcORM {
    //根据id查询
    public  static Hero executeQuery(int id){

        /**
         * 创建属性后面关闭资源
         */
        //Connection数据库
        Connection connection=null;
        //Statement执行sql的对象
        Statement statement=null;
        //
        ResultSet resultSet=null;
        Hero hero=null;
        try {
            connection= jdbcUtils.getConnection();
            //创建执行sql的对象
            statement=connection.createStatement();
            //查询数据库所有数据用executeQuery() 返回结果集 resultSet

            String sql = "select * from hero where id = " + id;
            resultSet =   statement.executeQuery(sql);

            if (resultSet.next()){
                hero=new Hero();

             hero.name =   resultSet.getString(2);
             hero.hp=    resultSet.getFloat("hp");
                 hero.damage= resultSet.getInt(4);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(connection,statement,resultSet);
        }
        return  hero ;


    }


    //根据id删除
    public  static void delete(int id){

        /**
         * 创建属性后面关闭资源
         */
        //Connection数据库
        Connection connection=null;
        //Statement执行sql的对象
        Statement statement=null;
        //

        Hero hero=null;
        try {
            connection= jdbcUtils.getConnection();
            //创建执行sql的对象
            statement=connection.createStatement();
            //查询数据库所有数据用executeQuery() 返回结果集 resultSet

            String sql = "delete from hero where id="+id;
                statement.executeUpdate(sql);
            System.out.println("删除成功！");




        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(connection,statement,null);
        }



    }


    public static void main(String[] args) {
//          Hero h= executeQuery(1);

           TestJdbcORM testJdbcORM=new TestJdbcORM();
           testJdbcORM.delete(3);


//        System.out.println(h.name);

    }
}
