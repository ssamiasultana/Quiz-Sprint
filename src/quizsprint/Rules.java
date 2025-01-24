package quizsprint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start, back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading = new JLabel("Welcome " + name);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBounds(0, 20, 800, 36);
        heading.setFont(new Font("Lucida Handwriting", Font.BOLD, 28));
        heading.setForeground(new Color(0, 154, 68));
        add(heading);
        
        JLabel toText = new JLabel("to");
        toText.setHorizontalAlignment(JLabel.CENTER);
        toText.setBounds(350, 50, 100, 20); 
        toText.setFont(new Font("Lucida Handwriting", Font.PLAIN, 16));
        toText.setForeground(Color.BLACK);
        add(toText);
        
        JLabel quizSprint = new JLabel("<html><font color='#FBC211'>Quiz</font> <font color='#1E90FE'>Sprint</font></html>");
        quizSprint.setHorizontalAlignment(JLabel.CENTER);
        quizSprint.setBounds(300, 60, 200, 30); 
        quizSprint.setFont(new Font("Lucida Handwriting", Font.BOLD, 18));
        add(quizSprint);
        
        
        JLabel rulesTitle = new JLabel("Rules");
        rulesTitle.setBounds(20, 120, 100, 20);
        rulesTitle.setFont(new Font("Roboto", Font.BOLD, 24));
        rulesTitle.setForeground(new Color(30, 144, 254));
        add(rulesTitle);
        
  
        JLabel rules = new JLabel();
        rules.setBounds(20, 140, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+
                "1. There will be 10 questions on screen one after another." + "<br><br>" +
                "2. You are required to answer each question within the 15 seconds." + "<br><br>" +
                "3. If you fail to select an answer within 15 seconds, you will be passed to the next question with another 15 seconds." + "<br><br>" +
                "4. You only need to select the right answer; a submit button will appear at the end of the last question." + "<br><br>" +
                "5. Do not Panic! You will Do good." + "<br><br>" +
                "6. Do not Cheat. Cheating is nothing to be proud of." + "<br><br>" +
                "7. LEARN, TEACH AND ACE." + "<br><br>" +
            "</html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){
            
        }else {
            setVisible(false);
            new Login();
        }
        
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new Rules("User"));
    }
}