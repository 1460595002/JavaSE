package JDBC.exer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/18 0018
 * Time: 10:23
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class execute {


    //插入，删除，修改方法
    public static void executeUpdate(String sql) throws SQLException {
        //Connection数据库
        Connection connection=null;
        //Statement执行sql的对象
        Statement statement=null;
        //
        ResultSet resultSet=null;

       try {


           connection = jdbcUtils.getConnection();
           //创建执行sql的对象
           statement = connection.createStatement();


           //插入，删除，修改 就用executeUpdate方法执行sql
           statement.executeUpdate(sql);
           //也可以用.execute()方法不过效率比较慢
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           //关闭连接
           jdbcUtils.release(connection,statement,resultSet);
       }

    }


    //查询所有的方法
    public  static  ResultSet  executeQuery(String sql){

        /**
         * 创建属性后面关闭资源
         */
        //Connection数据库
        Connection connection=null;
        //Statement执行sql的对象
        Statement statement=null;
        //
        ResultSet resultSet=null;

       try {
           connection= jdbcUtils.getConnection();
           //创建执行sql的对象
           statement=connection.createStatement();
           //查询数据库所有数据用executeQuery() 返回结果集 resultSet
         resultSet =   statement.executeQuery(sql);
         while (resultSet.next()){
             //如果知道数据库总的字段类型就根据类型get 不知道用getObject()
             System.out.print("id="+resultSet.getObject("id")+" ");
             System.out.print("name="+resultSet.getObject("name")+" ");
             System.out.print("hp="+resultSet.getObject("hp")+" ");
         }


       } catch (SQLException e) {
           e.printStackTrace();
       }finally {
          jdbcUtils.release(connection,statement,resultSet);
       }
         return  resultSet ;


    }
    //查询数据库中的总数
    public static  void total(String sql) {
        //Connection数据库
        Connection connection = null;
        //Statement执行sql的对象
        Statement statement = null;
        //
        ResultSet resultSet = null;

        try {
            connection = jdbcUtils.getConnection();
            //创建执行sql的对象
            statement = connection.createStatement();
            //查询数据库所有数据用executeQuery() 返回结果集 resultSet
            resultSet = statement.executeQuery(sql);

            int total=0;
            while (resultSet.next()){
                total=resultSet.getInt(1);
            }
            System.out.println("总数"+total);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //分页
    public static void list(int start,int count){

        //Connection数据库
        Connection connection = null;
        //Statement执行sql的对象
        Statement statement = null;
        //
        ResultSet resultSet = null;

        try {
            connection = jdbcUtils.getConnection();
            //创建执行sql的对象
            statement = connection.createStatement();
            //查询数据库所有数据用executeQuery() 返回结果集 resultSet
            //查询分页sql
            String sql="select * from hero limit "+start+","+count;
            resultSet = statement.executeQuery(sql);


            while (resultSet.next()){

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws SQLException {
        execute d=new execute();
        //对数据库操作有变化的用executeUpdate()
//        d. executeUpdate("delete from hero where id = 17");
//        d. executeUpdate("INSERT INTO `hero`(`id`, `name`, `damage`) VALUES (105, 'timo', 333)");

        //查询数据库中数据，对数据库没有变化用executeQuery()
        ResultSet resultSet = d.executeQuery("SELECT * FROM `how2java`.`hero` LIMIT 0, 5");

        //查询总数：
//           d.total("SELECT  COUNT(*) FROM hero ");


        //分页

        d.list(0,5);

    }

}
