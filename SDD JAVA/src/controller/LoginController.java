package controller;

import javax.swing.JOptionPane;

import view.LoginView;

public class LoginController {
	   public static void main(String arg[])
	   {
	   try
	   {
	   LoginView frame=new LoginView();
	   frame.setSize(500,400);
	   frame.setVisible(true);
	   }
	   catch(Exception e)
	   {JOptionPane.showMessageDialog(null, e.getMessage());}
	   }
	 }

