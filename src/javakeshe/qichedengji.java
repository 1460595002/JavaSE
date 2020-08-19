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

public class qichedengji extends JFrame implements ActionListener{

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
	public void B(){
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qichedengji window = new qichedengji();
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
	public qichedengji() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("???");
		frame.setBounds(100, 100, 450, 373);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(120, 59, 105, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("??????????");
		lblNewLabel.setBounds(27, 62, 82, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("??????");
		lblNewLabel_1.setBounds(27, 94, 72, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 91, 105, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("????????");
		label.setBounds(120, 20, 90, 18);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_2 = new JLabel("????");
		lblNewLabel_2.setBounds(27, 125, 72, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 122, 103, 24);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("????????");
		label_1.setBounds(27, 157, 72, 18);
		frame.getContentPane().add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 159, 103, 24);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_2 = new JLabel("?????");
		label_2.setBounds(27, 188, 72, 18);
		frame.getContentPane().add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 190, 103, 24);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_3 = new JLabel("????");
		label_3.setBounds(29, 222, 72, 18);
		frame.getContentPane().add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 223, 104, 24);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton button = new JButton("??????");
		button.setBounds(130, 265, 113, 27);
		frame.getContentPane().add(button);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (textField.getText().isEmpty()||textField_1.getText().isEmpty()||textField_3.getText().isEmpty()||textField_2.getText().isEmpty()||textField_4.getText().isEmpty()||textField_5.getText().isEmpty())
		{
		   JOptionPane.showMessageDialog(null, "??????????????");
		   return;
		}  else {
			String host=textField.getText();  //??????
			String carName=textField_1.getText();  //?????
			String carType=textField_2.getText();  //?????
			String carProduce=textField_3.getText(); //??????
			String hostAddress=textField_4.getText(); //???????
			String hostPhone=textField_5.getText();  //??????
			qicheSQL rs=new qicheSQL();
			try{
				   rs.sql=rs.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				   
					try{   
				   String sql1="insert into car(host,carName,carType,carProduce,hostAddress,hostPhone)values('"+host+"','"+carName+"','"+carType+"','"+carProduce+"','"+hostAddress+"','"+hostPhone+"')";
					rs.sql.executeUpdate(sql1);//???????"
					JOptionPane.showMessageDialog(null, "?????");
					textField.setText(null);
					textField_1.setText(null);
					textField_2.setText(null);;
					textField_3.setText(null);
					textField_4.setText(null);
					textField_5.setText(null);
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "?????");
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



