package javakeshe;
import java.awt.EventQueue;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
/*public class qicheSQL {
   public static Connection connectqiche(String qicheName,String id,String p){
	   Connection con=null;
	   try{ Class.forName("com.mysql.jdbc.Driver");
	   }
	   catch(Exception e){System.out.println ();}
	   String uri="jdbc:mysql://localhost:3306/qiche?useSSL=true&characterEncoding=utf-8";
	   //String user="root";
	   //String password="";
	   try{
		   con=DriverManager.getConnection(uri, id, p);
	   }
	   catch(SQLException e){System.out.println ();}
	   return con;
   }
}*/
import java.sql.*;
public class qicheSQL {
	Connection con=null;
	   PreparedStatement preSql;
	   Statement sql;
	   ResultSet rs;
   public qicheSQL(){
	   
	   try{ Class.forName("com.mysql.jdbc.Driver");
	   
	   }
	   catch(Exception e){System.out.println ();}
	   String uri="jdbc:mysql://localhost:3306/qiche?useSSL=true&characterEncoding=utf-8";
	   String user="root";
	   String password="";
	   try{
		   con=DriverManager.getConnection(uri, user, password);
	   }
	   catch(SQLException e){System.out.println ();}
   }
   

public void delete(String workerName){
	   try{
		   sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		   
			try{   
		   String sql1="DELETE FROM worker WHERE workerName='"+workerName+"'";
			sql.executeUpdate(sql1);//¸üÐÂÓï¾ä
			}catch(Exception e1){
				System.out.println(1);
				e1.printStackTrace();
			}
		   con.close();
	   }
	   catch(SQLException e){
		   System.out.println(e);
	   }
}
}