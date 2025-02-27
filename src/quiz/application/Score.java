package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("<html>Thank you " + name + " for playing <font color='#FBC211'>Quiz</font> <font color='#1E90FE'>Sprint</font></html>");

        heading.setBounds(50, 40, 700, 50);
        heading.setFont(new Font("Lucida Handwriting", Font.BOLD, 26));
        add(heading);

        JLabel lblscore = new JLabel("<html>Your score is <font color='#FF00FF'>" + score + "</font></html>");

        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Lucida Handwriting", Font.BOLD, 24));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
