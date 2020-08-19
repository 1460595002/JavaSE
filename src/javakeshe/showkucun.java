package javakeshe;

import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class showkucun {
	private JFrame frame;
	private JTable tabDemo;
	private JScrollPane scpDemo;
	private JTableHeader jth;
    Object[][]info;
	   PreparedStatement preSql;
	   Statement sql;
	   ResultSet rs;
	/**
	 * Launch the application.
	 */
	public void O(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showkucun window = new showkucun();  //����������Ϣ���ڽ���
					window.frame.setVisible(true);  //���ô��ڿɼ�
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the application.
	 */
	public showkucun() {
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		qicheSQL cz=new qicheSQL();
		try{
			   sql=cz.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			   int count=0;
				try{   
			   String sql1="select * FROM lingjiankucun";
			   Statement pstm=cz.con.createStatement();
			   rs=pstm.executeQuery(sql1);
               while(rs.next()) {
            	   count++;
               }
			   rs=pstm.executeQuery(sql1);
			   int m=count;
			   info=new Object[m][6];
			   count=0;
			   while(rs.next()){
				   info[count][0]=rs.getString("partName");
				   info[count][1]=rs.getString("partStock");
				   count++;
			   }
	
				}catch(Exception e1){
					e1.printStackTrace();
				}
			   cz.con.close();
		   }
		   catch(SQLException e){
			   System.out.println(e);
		   }
		frame = new JFrame("�����Ϣ");  //newһ��Jframe����
		int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2;;  //�����û���Ļ���Զ������ؼ�����ʾλ��
		int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;;
		
		frame.setBounds(screenWidth/2, screenHeight/2, screenWidth, screenHeight);
		frame.getContentPane().setLayout(null);	
		   String[] title={"�����","��������"};
		   scpDemo=new JScrollPane();
		   scpDemo.setBounds(10,50,500,370);
		   frame.getContentPane().add(scpDemo);
		  
		   tabDemo=new JTable(info,title);
		   jth=tabDemo.getTableHeader();
		   scpDemo.getViewport().add(tabDemo);

	  }
}
