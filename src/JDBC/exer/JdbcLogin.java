package JDBC.exer;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/18 0018
 * Time: 13:52
 * E-mail:1460595002@qq.com
 * 类说明:登录验证
 */
public class JdbcLogin {


    //初始化方便使用后进行关闭
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;


    @Test
    public void test(){

        try {
            //数据库
            connection=jdbcUtils.getConnection();
            //statement执行sql的对象
            statement=connection.createStatement();
            String name="das";
            String password="1223";

            String sql="SELECT `name`, `password` FROM user1 where `name`='name' AND `password`='password'";
            //通过executeQuery方法执行sql 返回结果集ResultSet
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()){
                System.out.println("密码正确！");
            }else {
                System.out.println("账号密码错误！");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    //mysql事务
    @Test
    public void test2() throws SQLException {

            try {
        //数据库
        connection=jdbcUtils.getConnection();
        //statement执行sql的对象
        statement=connection.createStatement();
        String name="das";
        String password="1223";

        //关闭自动提交，自动开启事务
       connection.setAutoCommit(false);//开启事务

        String sql="SELECT `name`, `password` FROM user1 ";
        //通过executeQuery方法执行sql 返回结果集ResultSet
        ResultSet resultSet = statement.executeQuery(sql);

                //int x = 1/0; //报错
                String sql1="SELECT `name`, `password` FROM user1 ";
                ResultSet resultSet2 = statement.executeQuery(sql1);

                //业务完毕提交事务
                connection.commit();
                System.out.println("成功！");



    }catch (Exception e){
                //如果失败，则回滚事务
                //如果不显式写，若失败，则默认回滚
                connection.rollback();
        e.printStackTrace();
    }
}





}
