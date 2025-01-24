package quizsprint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, back ;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel enjoy = new JLabel("Enjoy");
        enjoy.setBounds(850, 30, 150, 40);
        enjoy.setFont(new Font("Segoe Print", Font.BOLD, 26)); 
        enjoy.setForeground(new Color(0, 0, 0)); 
        add(enjoy);
        
        JLabel heading = new JLabel("<html><font color='#FBC211'>Quiz</font> <font color='#1E90FE'>Sprint</font></html>");
        heading.setBounds(750, 60, 300, 52);
        heading.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
        //heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        
        JLabel name = new JLabel("Enter your Name");
        name.setBounds(810, 160, 300, 25);
        name.setFont(new Font("Tahoma", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(tfname);
        
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200, 500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == rules){
            String name =tfname.getText();
            setVisible(false);
            new Rules(name);
            
        } else if (ae.getSource()== back){
        setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        
        new Login();
    
    } 
}
    
    
    
    

        
        

	
	