//package awtLaundary;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//
//public class Login implements ActionListener
//{
//	JFrame f;
//	JButton b;
//	JTextField user;
//	JPasswordField pswrd;
//	
//	public Login() 
//	{
//		f=new JFrame();
//		f.setLayout(null);
//
//		user=new JTextField();
//		user.setBounds(50,50,150,30);
//		
//		pswrd=new JPasswordField();
//		pswrd.setBounds(50,90,150,30);
//		
//		b=new JButton("login");
//		b.setBounds(50,130,150,30);
//		b.addActionListener(this);
//		
//		f.add(user);
//		f.add(pswrd);
//		f.add(b);
//		f.setVisible(true);
//		f.setSize(300,300);
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) 
//	{
//		if(e.getSource()==b)
//		{
//			String userr=user.getText();
//			String p=pswrd.getText();
//			if(userr.equals("ducat") && p.equals("123"))
//			{
//				new Laundry("Laundry");
//				f.setVisible(false);
//			}
//			else
//			{
//				user.setText(null);
//				pswrd.setText(null);
//			}
//		}
//		
//	}
//	public static void main(String[] args) 
//	{
//		new Login();
//	}
//	
//
//}
