package javakeshe;

import java.sql.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class dinghuojihua extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public void U() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dinghuojihua window = new dinghuojihua();
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
	public dinghuojihua() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("����ƻ�");
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("��������ƻ�");
		label.setBounds(142, 44, 128, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("�����������");
		label_1.setBounds(59, 100, 118, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("�������������");
		label_2.setBounds(58, 147, 111, 18);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(171, 100, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 147, 86, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("���");
		button.setBounds(115, 213, 113, 27);
		frame.getContentPane().add(button);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty()||textField_1.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "������λ����Ϊ��");
		   return;
		}  else {
			String partName=textField.getText();  //������
			String partOrder=textField_1.getText();  //���ƺ�
			qicheSQL rs=new qicheSQL();
			try{
				   rs.sql=rs.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				   
					try{   
				   String sql1="insert into lingjiankucun(partName,partOrder)values('"+partName+"','"+partOrder+"')";
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
