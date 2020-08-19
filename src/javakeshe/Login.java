package javakeshe;


import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class Login extends JFrame implements ActionListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Login login=new Login();
		login.A();
		
	}
public void A() {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("�����������ϵͳ");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("�Ǽ�");
		menuBar.add(menu);
		JMenuItem Item1 = new JMenuItem("�����Ǽ�");
		menu.add(Item1);
		
		JMenuItem Item2 = new JMenuItem("��������Ǽ�");
		menu.add(Item2);
		
		JMenu menu2 = new JMenu("�������");
		menuBar.add(menu2);
		JMenuItem Item3 = new JMenuItem("������");
		menu2.add(Item3);
		JMenuItem Item4 = new JMenuItem("�������");
		menu2.add(Item4);
		JMenuItem Item5 = new JMenuItem("��������ƻ�");
		menu2.add(Item5);

		JMenu menu3 = new JMenu("��ѯ");
		menuBar.add(menu3);
		JMenuItem Item6 = new JMenuItem("����");
		menu3.add(Item6);
		JMenuItem Item7 = new JMenuItem("�Ǽǵ�");
		menu3.add(Item7);
		JMenuItem Item8 = new JMenuItem("������");
		menu3.add(Item8);
		JMenuItem Item9= new JMenuItem("Ա����Ϣ");
		menu3.add(Item9);
		JMenuItem Item10 = new JMenuItem("�������");
		menu3.add(Item10);
		
		JMenu menu4 = new JMenu("Ա������");
		menuBar.add(menu4);
		JMenuItem Item11 = new JMenuItem("���Ա��");
		menu4.add(Item11);
		JMenuItem Item12 = new JMenuItem("ɾ��Ա��");
		menu4.add(Item12);
	
		JMenu menu5 = new JMenu("��ӡ");
		menuBar.add(menu5);
		JMenuItem Item13 = new JMenuItem("��Ʊ");
		menu5.add(Item13);
		JMenuItem Item14 = new JMenuItem("Ա�������±�");
		menu5.add(Item14);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   ��ӭ���������������ϵͳ");
		lblNewLabel.setBounds(84, 44, 318, 82);
		frame.getContentPane().add(lblNewLabel);
		
		Item1.addActionListener(this);
		Item2.addActionListener(this);
		Item3.addActionListener(this);
		Item4.addActionListener(this);
		Item5.addActionListener(this);
		Item6.addActionListener(this);
		Item7.addActionListener(this);
		Item8.addActionListener(this);
		Item9.addActionListener(this);
		Item10.addActionListener(this);
		Item11.addActionListener(this);
		Item12.addActionListener(this);
		Item13.addActionListener(this);
		Item14.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		 String ItemName = e.getActionCommand();
         if(ItemName.equals("�����Ǽ�")){
			qichedengji dengji=new qichedengji();
			dengji.B();
		 }
         else if(ItemName.equals("��������Ǽ�")){
        	 qichexiulidengji xiuli=new qichexiulidengji();
        	 xiuli.C();
         }
         else if(ItemName.equals("������")){
        	 lingjianruku ruku=new lingjianruku();
        	 ruku.D();
         }
         else if(ItemName.equals("�������")){
        	 lingjianchukudan chuku=new lingjianchukudan();
        	 chuku.E();
         }
         else if(ItemName.equals("��������ƻ�")){
        	 dinghuojihua jihua=new dinghuojihua();
        	 jihua.U();
         }
         else if(ItemName.equals("����")){
        	 EventQueue.invokeLater(new Runnable() {
     			public void run() {
     				try {
     					chaxunxiuli frame = new chaxunxiuli();
     					frame.setVisible(true);
     				} catch (Exception e) {
     					e.printStackTrace();
     				}
     			}
     		});
         }
         else if(ItemName.equals("�Ǽǵ�")){
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
         else if(ItemName.equals("������")){
        	 chaxunlingjiankucun kucun=new chaxunlingjiankucun();
        	 kucun.H();
         }
         else if(ItemName.equals("Ա����Ϣ")){
        	 EventQueue.invokeLater(new Runnable() {
     			public void run() {
     				try {
     					chaxunyuangong frame = new chaxunyuangong();
     					frame.setVisible(true);
     				} catch (Exception e) {
     					e.printStackTrace();
     				}
     			}
     		});
         }
         else if(ItemName.equals("�������")){
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
         else if(ItemName.equals("���Ա��")){
        	 tianjiayuangong tianjia=new tianjiayuangong();
        	 tianjia.K();
         }
         else if(ItemName.equals("ɾ��Ա��")){
        	 shanchuyuangong shanchu=new shanchuyuangong();
        	 shanchu.R();
         }
         else if(ItemName.equals("��Ʊ")){
        	 dayinfapiao fapiao=new dayinfapiao();
        	 fapiao.M();
         }
         else if(ItemName.equals("Ա�������±�")){
        	 yuangonggongziyuebao yuebao=new yuangonggongziyuebao();
        	 yuebao.N();
         }
	}
	
}
