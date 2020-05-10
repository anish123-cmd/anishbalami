package cases;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Register {
	JTextField tname, temail, tcountry, tcity, taddress;
	JLabel lname, lemail, lcountry, lcity, laddress;
	JButton submit;
	
	Register(){
		JFrame jf = new JFrame();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		jf.setTitle("Registration Form");
		jf.setSize(400,400);
		jf.setLocationRelativeTo(null);
		lname = new JLabel("Name");
		tname = new JTextField(20);
		lemail = new JLabel("Email Address");
		temail = new JTextField(20);
		lcountry = new JLabel("Country");
		tcountry = new JTextField(20);
		lcity = new JLabel("City");
		tcity = new JTextField(20);
		laddress = new JLabel("Address");
		taddress = new JTextField(20);
		
		JButton btn = new JButton("Submit");
		jp1.add(lname); jp1.add(tname);
		jp1.add(lemail); jp1.add(temail);
		jp1.add(lcountry); jp1.add(tcountry);
		jp1.add(lcity); jp1.add(tcity);
		jp1.add(laddress); jp1.add(taddress);
		
		jp1.add(btn);
		
		jp1.setLayout(new GridLayout(5,3));
		jp2.setLayout(new FlowLayout());
		
		jf.add(jp1);
		jf.add(jp2);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String name, email,country,city,address;
				HashMap<Integer,String> hm = new HashMap<Integer,String>();
				name = tname.getText().toString();
				email = temail.getText().toString();
				country = tcountry.getText().toString();
				city = tcity.getText().toString();
				address = taddress.getText().toString();
				
				hm.put(1,name);
				hm.put(2,email);
				hm.put(3,country);
				hm.put(4,city);
				hm.put(5,address);
				
				String msg = "Sucessful Registration";
				JOptionPane.showMessageDialog(jf,msg);
			}

		});
		
	}
	public static void main(String args[]) {
		Login lg = new Login();
		
		
	}
}
