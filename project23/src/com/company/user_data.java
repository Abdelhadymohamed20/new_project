package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class user_data extends JFrame implements ActionListener  {
    JButton button;
    JButton button1;
    public String name123;
    user_data(){
        Border border = BorderFactory.createLineBorder(Color.black,1);// set border


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        name123 =scanner.next();*/


        button = new JButton("confirm");
        button.setFont(new Font("Roboto",Font.BOLD,20));
        button.setBackground(new Color(67, 247, 205));
        button.setOpaque(true);
        button.setFocusable(false);
        button.setBorder(border);
        button.addActionListener(this);
        button.setBounds(600,480,142,41);

        button1 = new JButton("Back");
        button1.setFont(new Font("Roboto",Font.BOLD,20));
        button1.setBackground(new Color(67, 247, 205));
        button1.setOpaque(true);
        button1.setFocusable(false);
        button1.setBorder(border);
        button1.addActionListener(this);
        button1.setBounds(430,480,142,41);


        JLabel label4 = new JLabel();
        label4.setText("Name:");
        label4.setBounds(250,170,200,30);
        label4.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label17 = new JLabel();
        label17.setText(name123);
        label17.setBounds(30,170,200,30);
        label17.setFont(new Font("Roboto",Font.BOLD,20));


        JLabel label5 = new JLabel();
        label5.setText("phone:");
        label5.setBounds(250,220,200,30);
        label5.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label18 = new JLabel();
        label18.setText("");
        label18.setBounds(350,220,200,30);
        label18.setFont(new Font("Roboto",Font.BOLD,20));

        JLabel label6 = new JLabel();
        label6.setText("address:");
        label6.setBounds(250,270,200,30);
        label6.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label19 = new JLabel();
        label19.setText("");
        label19.setBounds(350,270,200,30);
        label19.setFont(new Font("Roboto",Font.BOLD,20));


        JLabel label7 = new JLabel();
        label7.setText("trip index:");
        label7.setBounds(250,320,200,30);
        label7.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label20 = new JLabel();
        label20.setText("");
        label20.setBounds(350,320,200,30);
        label20.setFont(new Font("Roboto",Font.BOLD,20));



        this.setTitle("trip company");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(191, 255, 240));
        this.setLayout(null);
        this.add(button);
        this.add(button1);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label17);
        this.add(label18);
        this.add(label19);
        this.add(label20);

        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            this.dispose();

        }
        if (e.getSource() == button1) {
            this.dispose();
            try {
                new get_data();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

