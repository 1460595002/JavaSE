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
public class tianjiayuangong extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public void K() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tianjiayuangong window = new tianjiayuangong();
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
	public tianjiayuangong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Ա������");
		frame.setBounds(100, 100, 450, 284);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("�������");
		label.setBounds(144, 21, 95, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("���ţ�");
		label_1.setBounds(25, 61, 72, 18);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("������");
		label_2.setBounds(23, 86, 72, 18);
		frame.getContentPane().add(label_2);
		
		JLabel lblNewLabel = new JLabel("��ַ��");
		lblNewLabel.setBounds(25, 110, 72, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_3 = new JLabel("�绰��");
		label_3.setBounds(22, 133, 72, 18);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("�������ڣ�");
		label_4.setBounds(186, 60, 85, 18);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Сʱ���ʣ�");
		label_5.setBounds(178, 123, 83, 18);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("�������ڣ�");
		label_6.setBounds(178, 90, 84, 18);
		frame.getContentPane().add(label_6);
		
		textField = new JTextField();
		textField.setBounds(78, 59, 86, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 84, 86, 17);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 111, 86, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 134, 86, 17);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(268, 60, 86, 17);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(268, 92, 86, 17);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(269, 121, 86, 17);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.setBounds(134, 181, 113, 27);
		frame.getContentPane().add(button);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_3.getText().isEmpty()||textField_2.getText().isEmpty()||textField_4.getText().isEmpty()||textField_5.getText().isEmpty()||textField_6.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "������λ����Ϊ��");
		   return;
		}  else {
			String ID=textField.getText();  //����
			String workerName=textField_1.getText();  //Ա������
			String workerAddress=textField_2.getText();  //Ա����ַ
			String workerPhone=textField_3.getText(); //Ա������
			String birth=textField_4.getText(); //Ա����������
			String beginWork=textField_5.getText();  //��������
			String hourMoney=textField_6.getText();//Сʱ����
			qicheSQL rs=new qicheSQL();
			try{
				   rs.sql=rs.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				   
					try{   
				   String sql1="insert into worker values('"+ID+"','"+workerName+"','"+workerAddress+"','"+workerPhone+"','"+birth+"','"+beginWork+"','"+hourMoney+"')";
					rs.sql.executeUpdate(sql1);//�������"
					JOptionPane.showMessageDialog(null, "�洢�ɹ�");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);;
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					textField_6.setText(null);
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
