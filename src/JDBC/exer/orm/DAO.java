package JDBC.exer.orm;

import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/3/20 0020
 * Time: 10:28
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public interface DAO {



    //添加
    public void add(Hero hero);

    //修改
    public void update(Hero hero);
    //删除
    public void delete(int id) throws SQLException;

    //获取
    public Hero get(int id);

    //查询
    public List<Hero>list();

    //分页查询
    public List<Hero>list(int start,int count);










}
