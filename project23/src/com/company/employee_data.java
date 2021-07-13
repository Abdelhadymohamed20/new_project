package com.company;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class employee_data extends JFrame implements ActionListener {

    JButton button;
    JButton button1;

    employee_data(){
        ImageIcon logo = new ImageIcon(new ImageIcon("/Users/ahmedsameh/Desktop/3F2C3E81-E445-406F-9765-20EECA1BB88B.png").getImage().getScaledInstance(142, 140, Image.SCALE_DEFAULT)); //import the logo
        Border border = BorderFactory.createLineBorder(Color.black,1);// set border


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        name123 =scanner.next();*/

        JLabel label1 = new JLabel();//the page title
        label1.setText("Employee Data");
        label1.setBounds(280,80,450,60);
        label1.setFont(new Font("Roboto",Font.BOLD,45));

        JLabel label2 = new JLabel();//the logo
        label2.setIcon(logo);
        label2.setBorder(border);
        label2.setBounds(15,15,142,140);

        button = new JButton("confirm");
        button.setFont(new Font("Roboto",Font.BOLD,20));
        button.setBackground(new Color(255,173,173));
        button.setOpaque(true);
        button.setFocusable(false);
        button.setBorder(border);
        button.addActionListener(this);
        button.setBounds(600,480,142,41);

        button1 = new JButton("Back");
        button1.setFont(new Font("Roboto",Font.BOLD,20));
        button1.setBackground(new Color(255,173,173));
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
        label17.setText("");
        label17.setBounds(30,170,200,30);
        label17.setFont(new Font("Roboto",Font.BOLD,20));


        JLabel label5 = new JLabel();
        label5.setText("password:");
        label5.setBounds(250,220,200,30);
        label5.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label18 = new JLabel();
        label18.setText("");
        label18.setBounds(350,220,200,30);
        label18.setFont(new Font("Roboto",Font.BOLD,20));

        JLabel label6 = new JLabel();
        label6.setText("phone:");
        label6.setBounds(250,270,200,30);
        label6.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label19 = new JLabel();
        label19.setText("");
        label19.setBounds(350,270,200,30);
        label19.setFont(new Font("Roboto",Font.BOLD,20));


        JLabel label7 = new JLabel();
        label7.setText("address:");
        label7.setBounds(250,320,200,30);
        label7.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label20 = new JLabel();
        label20.setText("");
        label20.setBounds(350,320,200,30);
        label20.setFont(new Font("Roboto",Font.BOLD,20));

        JLabel label8 = new JLabel();
        label8.setText("salary:");
        label8.setBounds(250,370,200,30);
        label8.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label21 = new JLabel();
        label21.setText("");
        label21.setBounds(350,370,200,30);
        label21.setFont(new Font("Roboto",Font.BOLD,20));

        JLabel label9 = new JLabel();
        label9.setText("working:");
        label9.setBounds(250,420,200,30);
        label9.setFont(new Font("Roboto",Font.BOLD,20));
        JLabel label22 = new JLabel();
        label22.setText("");
        label22.setBounds(350 ,420,200,30);
        label22.setFont(new Font("Roboto",Font.BOLD,20));


        this.setTitle("trip company");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(222,216,216));
        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.add(button);
        this.add(button1);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);
        this.add(label9);
        this.add(label17);
        this.add(label18);
        this.add(label19);
        this.add(label20);
        this.add(label21);
        this.add(label22);
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
