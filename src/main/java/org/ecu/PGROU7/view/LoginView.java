/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ecu.PGROU7.view;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author WANG
 */
public class LoginView extends JFrame{
	JLabel nameLabel = new JLabel("HCERES",JLabel.CENTER);
        SpringLayout springLayout = new SpringLayout();
	JPanel centerPanel = new JPanel(springLayout);
	
	JLabel userNameLabel = new JLabel("Email:");
	JTextField userText = new JTextField();
	
	JLabel pwdLabel = new JLabel("Mot de passe:");
	JTextField pwdText = new JTextField();
	
	JButton loginBtn = new JButton("Connexion");
	
	public LoginView(){
		super("HCERES");
		Container contentPane = getContentPane();
		
		nameLabel.setFont(new Font("Arial",Font.PLAIN,40));
		nameLabel.setPreferredSize(new Dimension(0,80));
		
		Font centerFont = new Font("Arial",Font.PLAIN,20);
		
		userNameLabel.setFont(centerFont);
		userText.setPreferredSize(new Dimension(200,30));
		
		pwdLabel.setFont(centerFont);
		pwdText.setPreferredSize(new Dimension(200,30));
		
		loginBtn.setFont(centerFont);
                
		centerPanel.add(userNameLabel);
		centerPanel.add(userText);
		centerPanel.add(pwdLabel);
		centerPanel.add(pwdText);
		centerPanel.add(loginBtn);
                
		Spring childWidth = Spring.sum(Spring.sum(Spring.width(userNameLabel),Spring.width(userText)),Spring.constant(20));
		int offsetX = childWidth.getValue()/2;
		
		springLayout.putConstraint(SpringLayout.WEST,userNameLabel,-offsetX,SpringLayout.HORIZONTAL_CENTER,centerPanel);
		springLayout.putConstraint(SpringLayout.NORTH,userNameLabel,20,SpringLayout.NORTH,centerPanel);
		
		springLayout.putConstraint(SpringLayout.WEST,userText,20,SpringLayout.EAST,userNameLabel);
		springLayout.putConstraint(SpringLayout.NORTH,userText,0,SpringLayout.NORTH,userNameLabel);
		
		springLayout.putConstraint(SpringLayout.EAST,pwdLabel,0,SpringLayout.EAST,userNameLabel);
		springLayout.putConstraint(SpringLayout.NORTH,pwdLabel,20,SpringLayout.SOUTH,userNameLabel);
				
		springLayout.putConstraint(SpringLayout.WEST,pwdText,20,SpringLayout.EAST,pwdLabel);
		springLayout.putConstraint(SpringLayout.NORTH,pwdText,0,SpringLayout.NORTH,pwdLabel);
                
		springLayout.putConstraint(SpringLayout.HORIZONTAL_CENTER,loginBtn,0,SpringLayout.HORIZONTAL_CENTER,centerPanel);
		springLayout.putConstraint(SpringLayout.NORTH,loginBtn,20,SpringLayout.SOUTH,pwdLabel);
                
		contentPane.add(nameLabel,BorderLayout.NORTH);
		contentPane.add(centerPanel,BorderLayout.CENTER);
                setSize(600,400);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);      
	}
        
        public static void main(String[] args){
            new LoginView();
        }
}
