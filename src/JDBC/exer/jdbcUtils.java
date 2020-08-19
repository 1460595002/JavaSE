package JDBC.exer;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/18 0018
 * Time: 10:40
 * E-mail:1460595002@qq.com
 * 类说明:jdbc的工具类
 */
public class jdbcUtils {


    //获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/how2java?characterEncoding=UTF-8", "root", "1460595002");
    }


    //释放连接资源 关闭连接
    public static void release(Connection conn, Statement st, ResultSet rs) {
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}