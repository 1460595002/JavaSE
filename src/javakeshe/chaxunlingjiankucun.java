package javakeshe;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class chaxunlingjiankucun extends JFrame implements ActionListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void H(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chaxunlingjiankucun window = new chaxunlingjiankucun();
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
	public chaxunlingjiankucun() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("��ѯ");
		frame.setBounds(100, 100, 450, 254);
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("��ѯ����������");
		button.setBounds(105, 75, 160, 27);
		frame.getContentPane().add(button);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		showkucun c=new showkucun();
		c.O();
	}
}
	
