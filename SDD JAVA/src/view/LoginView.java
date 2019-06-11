package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.LoginModel;

public class LoginView extends JFrame implements ActionListener{
	  JButton SUBMIT;
	  JPanel panel;
	  JLabel label1,label2;
	  final JTextField  text1,text2;
	   public LoginView()
	   {
	   label1 = new JLabel();
	   label1.setText("Username:");
	   text1 = new JTextField(15);

	   label2 = new JLabel();
	   label2.setText("Password:");
	   text2 = new JPasswordField(15);
	  
	   SUBMIT=new JButton("SUBMIT");
	   
	   panel=new JPanel(new GridLayout(3,1));
	   panel.add(label1);
	   panel.add(text1);
	   panel.add(label2);
	   panel.add(text2);
	   panel.add(SUBMIT);
//	   add(panel,BorderLayout.CENTER);
	   SUBMIT.addActionListener(this);
	   setTitle("LOGIN FORM");
	   }
	@Override
	public void actionPerformed(ActionEvent e) {
		   String value1=text1.getText();
		   String value2=text2.getText();
		   if (value1.equals("roseindia") && value2.equals("roseindia")) {
			   LoginModel page=new LoginModel();
		   page.setVisible(true);
		   JLabel label = new JLabel("Welcome:"+value1);
		   page.getContentPane().add(label);
		   }
		   else{
		   System.out.println("enter the valid username and password");
		   JOptionPane.showInputDialog(this,"Incorrect login or password",
		   "Error",JOptionPane.ERROR_MESSAGE);
		
	}
}
}