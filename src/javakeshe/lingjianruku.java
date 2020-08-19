package javakeshe;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.*;
public class lingjianruku extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public void D() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lingjianruku window = new lingjianruku();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lingjianruku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("零件管理");
		frame.setBounds(100, 100, 450, 300);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("零件入库单");
		label.setBounds(127, 31, 97, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("零件名：");
		label_1.setBounds(70, 65, 72, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("零件价格：");
		label_2.setBounds(72, 95, 85, 18);
		frame.getContentPane().add(label_2);
		
		JLabel lblNewLabel = new JLabel("零件数量：");
		lblNewLabel.setBounds(72, 127, 87, 18);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(146, 63, 86, 18);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 97, 86, 18);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 128, 86, 18);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("确定添加");
		btnNewButton.setBounds(95, 169, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_2.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "输入栏位不能为空");
		   return;
		}  else {
			String partName=textField.getText();  //零件名
			String price=textField_1.getText();  //零件价格
			String partStock=textField_2.getText(); //零件库存
			qicheSQL rs=new qicheSQL();
			try{
				   rs.sql=rs.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				   
					try{   
				  String sql1="insert into lingjiankucun(partName,price,partStock)values('"+partName+"','"+price+"','"+partStock+"')";
					rs.sql.executeUpdate(sql1);//更新语句"
					JOptionPane.showMessageDialog(null, "存储成功");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);;
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "存储失败");
						e1.printStackTrace();
					}
				   rs.con.close();
			}
			catch(SQLException e1){
				   System.out.println(e1);
			}
		} 

}
}
