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

public class yuangonggongziyuebao extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public void N() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yuangonggongziyuebao window = new yuangonggongziyuebao();
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
	public yuangonggongziyuebao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("��ӡԱ�������±�");
		frame.setBounds(100, 100, 517, 453);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ա�����ţ�");
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
				String[] yuebao = gongzixinxi(textField.getText().trim());
				textArea.append("���ţ�"+yuebao[0]+"\n");
				textArea.append("Ա������"+yuebao[1]+"\n");
				textArea.append("Сʱ���ʣ�"+yuebao[2]+"\n");
				textArea.append("����Сʱ��"+yuebao[3]+"\n");
				int m=(Integer.parseInt(yuebao[2]))*(Integer.parseInt(yuebao[3]));
				textArea.append("�¹��ʣ�"+m+"\n");
			}
		});
		button.setBounds(328, 338, 113, 27);
		frame.getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 70, 399, 189);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel label = new JLabel("������Ϣ");
		label.setBounds(185, 29, 100, 18);
		frame.getContentPane().add(label);
	}
	
	
	/**
	 * @param ID  ����ӡ������Ϣ��Ա������
	 * @return		      Ҫ��ӡ�Ĺ�����Ϣ
	 */
	/**
	 * @param ID  ����ӡ������Ϣ��Ա������
	 * @return		      Ҫ��ӡ�Ĺ�����Ϣ
	 */
	public static String[] gongzixinxi(String ID) {
		/*
		���ţ�           ID              worker
		Ա��������	workerName		worker
	       Сʱ���ʣ�	hourMoney		worker
	       ����Сʱ��     xiuliHour       carxiuli
		�¹��ʣ�        Money
		*/
		Connection connection = null;
		String[] yuebao = new String[4];
		
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
			
			/*��worker���л����Ϣ*/
			String sql = "select * from worker where ID = '";
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql +ID+ "'");
			while (resultSet.next()) {
				yuebao[0] =resultSet.getString(1);
				yuebao[1] =resultSet.getString(2);
				yuebao[2] =resultSet.getString(7);
				
				/*resultSet.getString(�к�)��ȡ�кŶ�Ӧ����ֵ*/
			}
			/*��carxiuli���л��������Ϣ*/
			sql = "select * from carxiuli where ID = '";
			resultSet = stmt.executeQuery(sql +ID+ "'");
			while (resultSet.next()) {
				yuebao[3] =resultSet.getString(7);
			}
			
			resultSet.close();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return yuebao;
	}

}
