package javakeshe;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;

public class dayinfapiao extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public void M() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dayinfapiao window = new dayinfapiao();
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
	public dayinfapiao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("��ӡ��Ʊ");
		frame.setBounds(100, 100, 517, 453);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ά���������ƺţ�");
		lblNewLabel.setBounds(14, 342, 122, 18);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(145, 339, 155, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("ȷ�ϴ�ӡ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				�˴���ӡ��Ʊ��Ϣ
				String[] fapiao = fapiaoxinxi(textField.getText().trim());
				/*trim()��ȥ���ַ����ж���Ŀո�*/
				for (int i = 0; i < fapiao.length; i++) {
					textArea.append(fapiao[i] + "\n");
				}
			}
		});
		button.setBounds(328, 338, 113, 27);
		frame.getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 70, 399, 189);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel label = new JLabel("��Ʊ��Ϣ");
		label.setBounds(185, 29, 100, 18);
		frame.getContentPane().add(label);
	}
	
	
	/**
	 * @param carName  ����ӡ��Ʊ��Ϣ�ĳ��ƺ�
	 * @return		      Ҫ��ӡ�ķ�Ʊ��Ϣ
	 */
	/**
	 * @param carName  ����ӡ��Ʊ��Ϣ�ĳ��ƺ�
	 * @return		      Ҫ��ӡ�ķ�Ʊ��Ϣ
	 */
	public static String[] fapiaoxinxi(String carName) {
		/*
		 ����������	host			car
		���ƺţ�		carName			car
		������ַ��	hostAddress		car
		�绰��		hostPhone		car
		������Ŀ��	carXiuli		carxiuli
		����Сʱ��	xiuliHour		carxiuli
		*/
		Connection connection = null;
		String[] fapiao = new String[5];
		
		try{ Class.forName("com.mysql.jdbc.Driver");
		   
		} catch(Exception e) {
			System.out.println ();
		}
		
	   String uri="jdbc:mysql://localhost:3306/qiche?useSSL=true&characterEncoding=utf-8";
	   String user="root";
	   String password="";

		try {
			connection=DriverManager.getConnection(uri, user, password);
			
			if (connection == null) {
				System.out.println("connection����Ϊ�գ�");
			}
			
			/*��car���л����Ϣ*/
			String sql = "select * from car where carName = '";
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql + carName + "'");
			while (resultSet.next()) {
				fapiao[0] = "����������" + resultSet.getString(1);
				fapiao[1] = "������ַ��" + resultSet.getString(5);
				fapiao[2] = "�����绰��" + resultSet.getString(6);
				/*resultSet.getString(�к�)��ȡ�кŶ�Ӧ����ֵ*/
			}
			
			/*��carxiuli���л��������Ϣ*/
			sql = "select * from carxiuli where carName = '";
			resultSet = stmt.executeQuery(sql + carName + "'");
			while (resultSet.next()) {
				fapiao[3] = "������Ŀ��" + resultSet.getString(3);
				fapiao[4] = "����Сʱ��" + resultSet.getString(7);
			}
			
			resultSet.close();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return fapiao;
	}

}
