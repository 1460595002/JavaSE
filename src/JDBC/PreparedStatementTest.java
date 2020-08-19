package JDBC;

import org.junit.Test;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/18 0018
 * Time: 17:00
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class PreparedStatementTest {

    //根据id查询对象
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        String url="jdbc:mysql://localhost:3307/how2java?useUnicode=true&characterEncoding=utf8&useSSl=true";
        String username = "root";
        String password = "1460595002";
        Connection connection = DriverManager.getConnection(url, username, password);


        PreparedStatement ps= null;
        for (int i=0;i<50;i++) {
            String sql="insert into `hero`(`id`,`name`,`hp`,`damage`) values (null,?,?,?)";
            ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);


            //设置参数
            ps.setString(1,"提莫");
            ps.setFloat(2,3.13f);
            ps.setInt(3,50);

            ps.executeUpdate();
        }


        ResultSet resultSet = ps.getGeneratedKeys();

        while (resultSet.next()){

            int id=resultSet.getInt(1);

            System.out.println(id);


        }


    }





}
