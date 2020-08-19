package javakeshe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class chaxunlingjianyongliang extends JFrame {

	private JPanel contentPane;
	private JTable carTable;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chaxunlingjianyongliang frame = new chaxunlingjianyongliang();
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
	public chaxunlingjianyongliang() {
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"�������"}));
		comboBox.setBounds(132, 433, 119, 24);
		panel.add(comboBox);
		
		JButton button = new JButton("ȷ�ϲ�ѯ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//					���������ѯ
					chaxundenji.showTable(model, "select * from lingjianyongliang where partName = '"
							+ textField.getText().trim() + "'");
				}
		});
		button.setBounds(470, 435, 113, 27);
		panel.add(button);
		
		
		JButton button_1 = new JButton("��ѯȫ��");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				��ѯȫ��
				chaxundenji.showTable(model, "select * from lingjianyongliang");
			}
		});
		button_1.setBounds(285, 489, 113, 27);
		panel.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(265, 436, 191, 24);
		panel.add(textField);
		textField.setColumns(10);
	}
}
