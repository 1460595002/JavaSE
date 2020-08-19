package javakeshe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class chaxundenji extends JFrame {

	private JPanel contentPane;
	private JTable carTable;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chaxundenji frame = new chaxundenji();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public chaxundenji() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 700, 593);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 5, 700, 402);
		panel.add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		carTable = new JTable(model);
		scrollPane.setViewportView(carTable);
		
		JLabel label = new JLabel("��ѯ��ʽ");
		label.setBounds(44, 439, 90, 18);
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"��������", "�����ƺ�"}));
		comboBox.setBounds(132, 433, 119, 24);
		panel.add(comboBox);
		
		JButton button = new JButton("ȷ�ϲ�ѯ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
//					������������ѯ
					showTable(model, "select * from car where host = '"
							+ textField.getText().trim() + "'");
				} else {
//					�����ƺŲ�ѯ
					showTable(model, "select * from car where carName = '"
							+ textField.getText().trim() + "'");
				}
			}
		});
		button.setBounds(470, 435, 113, 27);
		panel.add(button);
		
		
		JButton button_1 = new JButton("��ѯȫ��");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				��ѯȫ��
				showTable(model, "select * from car");
			}
		});
		button_1.setBounds(285, 489, 113, 27);
		panel.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(265, 436, 191, 24);
		panel.add(textField);
		textField.setColumns(10);
	}
	
	/**
	 * ִ�в�ѯ���querySql����������Ա�����ʽ��ʾ
	 * @param model		javax.swing.table.DefaultTableModel
	 * @param querySql	��ѯ���
	 */
	public static void showTable(DefaultTableModel model,String querySql) {
		Connection con = null;
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
			
		try {
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(querySql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			
			int colCount = rsmd.getColumnCount();
			Vector<String> title = new Vector<String>();
			for (int i = 1; i <= colCount; i++) {
				title.add(rsmd.getColumnLabel(i));
			}
			/**
			 * colCount	����
			 * title	����
			 * data 	�������
			 * rowData	����е�һ����¼
			 */
			Vector<Vector<String>> data = new Vector<Vector<String>>();
			int rowCount = 0;
			while (resultSet.next()) {
				rowCount++;
				
				Vector<String> rowData = new Vector<String>();
				for (int i = 1; i <= colCount; i++) {
					rowData.add(resultSet.getString(i));
				}
				/*����õļ�¼��ӵ������*/
				data.add(rowData);
				
				if (rowCount == 0) {
					model.setDataVector(null, title);
				} else {
					model.setDataVector(data, title);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, 
					"ϵͳ�����쳣�����������ݿ⡣ϵͳ�����˳�������", 
					"����", 0);
		}
	}
}

