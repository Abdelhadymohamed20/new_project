package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class login extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    JPasswordField passwordField;

    login(){

         ImageIcon logo = new ImageIcon(new ImageIcon("/Users/ahmedsameh/Desktop/3F2C3E81-E445-406F-9765-20EECA1BB88B.png").getImage().getScaledInstance(152, 150, Image.SCALE_DEFAULT)); //import the logo
         Border border = BorderFactory.createLineBorder(Color.black,1);// set border


         JLabel label1 = new JLabel();//the page title
         label1.setText("login page");
         label1.setBounds(310,72,450,60);
         label1.setFont(new Font("Roboto",Font.BOLD,45));


         JLabel label2 = new JLabel();//the logo
         label2.setIcon(logo);
         label2.setBorder(border);
         label2.setBounds(20,20,152,150);


         JLabel label3 = new JLabel();
         label3.setText("User Name:");
         label3.setBounds(250,230,200,30);
         label3.setFont(new Font("Roboto",Font.BOLD,20));
         textField = new JTextField();
         textField.setBounds(270,270,250,40);
         textField.setPreferredSize(new Dimension(250,40));
         textField.setFont(new Font("Roboto",Font.BOLD,12));
         textField.setForeground(Color.black);
         textField.setBackground(Color.WHITE);
         textField.setCaretColor(Color.BLACK);



         JLabel label4 = new JLabel();
         label4.setText("Password:");
         label4.setBounds(250,330,200,30);
         label4.setFont(new Font("Roboto",Font.BOLD,20));
         passwordField = new JPasswordField();
         passwordField.setBounds(270,370,250,40);
         passwordField.setPreferredSize(new Dimension(250,40));
         passwordField.setFont(new Font("Roboto",Font.BOLD,12));
         passwordField.setForeground(Color.black);
         passwordField.setBackground(Color.WHITE);
         passwordField.setCaretColor(Color.BLACK);


         button = new JButton("LogIn");
         button.setFont(new Font("Roboto",Font.BOLD,20));
         button.setBackground(new Color(255,173,173));
         button.setOpaque(true);
         button.setFocusable(false);
         button.setBorder(border);
         button.addActionListener(this);
         button.setBounds(600,480,142,41);


        this.setTitle("trip company");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(222,216,216));
        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(textField);
        this.add(passwordField);
        this.add(button);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button){
            this.dispose();
            try {
                new welcome();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}