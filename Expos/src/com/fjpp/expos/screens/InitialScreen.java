package com.fjpp.expos.screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class InitialScreen implements ActionListener{
	
	JFrame frame;
	JLabel lblTitle;
	JButton btnLogin;
	JButton btnSignup;
	
	public InitialScreen() {
		
		// background
		frame = new JFrame();
		
		frame.setTitle("Fjpp Expos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setLayout(null);
		frame.setVisible(true);

		// title
		lblTitle = new JLabel("Fjpp Expos");
		lblTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(160, 25, 400, 100);
		frame.add(lblTitle);
		
		// login button
		btnLogin = new JButton("Login");
		btnLogin.setBounds(85, 250, 150, 50);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.addActionListener(this);
		frame.add(btnLogin);
		
		// signup button
		btnSignup = new JButton("Sign up");
		btnSignup.setBounds(265, 250, 150, 50);
		btnSignup.setForeground(Color.BLACK);
		btnSignup.addActionListener(this);
		frame.add(btnSignup);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogin) {
			frame.dispose();
			new LoginScreen();
		}
		
		if (e.getSource() == btnSignup) {
			frame.dispose();
			new SignupScreen();
		}
	}
}
