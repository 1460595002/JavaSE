package javakeshe;
import java.sql.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class lingjianchukudan extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	Connection con=null;

	/**
	 * Launch the application.
	 */
	public void E(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lingjianchukudan window = new lingjianchukudan();
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
	public lingjianchukudan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�������");
		frame.setBounds(100, 100, 450, 300);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("������ⵥ");
		label.setBounds(125, 38, 102, 18);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("�����������");
		lblNewLabel.setBounds(69, 82, 92, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("�������������");
		label_1.setBounds(70, 125, 108, 18);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(177, 78, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 122, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ȷ�����������ⵥ");
		btnNewButton.setBounds(98, 181, 182, 27);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty()||textField_1.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "������λ����Ϊ��");
		   return;
		}  else {
			String partName=textField.getText();  //�����
			String useNumber=textField_1.getText(); //�������
			
			qicheSQL rs=new qicheSQL();
			try{
				   rs.sql=rs.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				   
					try{   
				   String sql1="insert into lingjianyongliang(partName,useNumber)values('"+partName+"','"+useNumber+"')";
					rs.sql.executeUpdate(sql1);//�������"
					JOptionPane.showMessageDialog(null, "�洢�ɹ�");
					textField.setText(null);
					textField_1.setText(null);
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "�洢ʧ��");
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
