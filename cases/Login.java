package cases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


public class Login {
	JTextField namefield, passwordfield;
	JLabel namelabel, passwordlabel;
	JButton loginbtn, registerbtn;
	
	Login(){
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.setSize(255,255);
		jf.setTitle("demo application");
		namelabel = new JLabel("User = ",JLabel.RIGHT);
		namefield = new JTextField(10);
		passwordlabel = new JLabel("Password = ",JLabel.RIGHT);
		
		passwordfield = new JTextField (10);
		loginbtn = new JButton("Login");
		registerbtn = new JButton("Register");
		
		jp.add(namelabel);
		jp.add(namefield);
		jp.add(passwordlabel);
		jp.add(passwordfield);
		jp.add(loginbtn);
		jp.add(registerbtn);
		jp.setLayout(new FlowLayout());
		
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
		loginbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String name, password;
				HashMap<Integer,String> hm = new HashMap<Integer,String>();
				name = namefield.getText().toString();
				password = passwordfield.getText().toString();
				hm.put(1,name);
				hm.put(2,password);
				JOptionPane jop =new JOptionPane();
				if(name == "ABC" && password == "ABC123") {
					String msg = "Login Successful";
					jop.showMessageDialog(jf,msg);
					
				}else {
					String msg = "Login Failed";
					jop.showMessageDialog(jf,msg);
					
				}
			}
		});
		registerbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Register r = new Register();
			}
		});
				
			
	}
	
}
