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

public class qichexiulidengji extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public void C(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qichexiulidengji window = new qichexiulidengji();
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
	public qichexiulidengji() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�Ǽ�");
		frame.setBounds(100, 100, 450, 300);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("��������");
		label.setBounds(137, 28, 80, 18);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("���ƺţ�");
		lblNewLabel.setBounds(88, 58, 72, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("������Ŀ��");
		label_1.setBounds(87, 85, 78, 18);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("�������ڣ�");
		lblNewLabel_1.setBounds(87, 108, 80, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("�깤����:");
		lblNewLabel_2.setBounds(88, 129, 83, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("�����ţ�");
		lblNewLabel_3.setBounds(88, 154, 85, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label_2 = new JLabel("����Сʱ��");
		label_2.setBounds(89, 177, 83, 18);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(165, 59, 86, 18);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("ȷ��");
		button.setBounds(128, 213, 113, 27);
		frame.getContentPane().add(button);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 81, 86, 18);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 104, 86, 18);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 129, 86, 18);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 152, 86, 18);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(165, 176, 86, 18);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_3.getText().isEmpty()||textField_2.getText().isEmpty()||textField_4.getText().isEmpty()||textField_5.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "������λ����Ϊ��");
		   return;
		}  else {
			String carName=textField.getText();  //���ƺ�
			String carxiuli=textField_1.getText();  //������Ŀ
			String beginDate=textField_2.getText(); //��������
			String finishDate=textField_3.getText(); //�깤����
			String ID=textField_4.getText();  //����
			String xiuliHour=textField_5.getText();//����Сʱ
			qicheSQL rs=new qicheSQL();
			try{
				   rs.sql=rs.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				   
					try{   
				   String sql1="insert into carxiuli(carName,carxiuli,beginDate,finishDate,ID,xiuliHour)values('"+carName+"','"+carxiuli+"','"+beginDate+"','"+finishDate+"','"+ID+"','"+xiuliHour+"')";
					rs.sql.executeUpdate(sql1);//�������"
					JOptionPane.showMessageDialog(null, "�洢�ɹ�");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);;
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
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
