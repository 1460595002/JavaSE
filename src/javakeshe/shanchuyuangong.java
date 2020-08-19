package javakeshe;

import java.awt.EventQueue;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class shanchuyuangong extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField textField;
	Connection con=null;
	   PreparedStatement preSql;
	   Statement sql;
	   ResultSet rs;

	/**
	 * Launch the application.
	 */
	public void R(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shanchuyuangong window = new shanchuyuangong();
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
	public shanchuyuangong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("��ѯ");
		frame.setBounds(100, 100, 450, 300);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("ɾ��Ա��");
		label.setBounds(137, 27, 101, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("������Ա������");
		label_1.setBounds(31, 67, 143, 18);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(173, 63, 121, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("ȷ��ɾ��");
		button.setBounds(125, 136, 113, 27);
		frame.getContentPane().add(button);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "������λ����Ϊ�գ�");
		   return;
		}else{
			qicheSQL rs=new qicheSQL();
			rs.delete(textField.getText());
			JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
			textField.setText(null);
		}
	}
}
