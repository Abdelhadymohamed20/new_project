package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class new_employee extends JFrame implements ActionListener {


    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;


    JButton button;
    JButton button1;

    new_employee(){

        ImageIcon logo = new ImageIcon(new ImageIcon("/Users/ahmedsameh/Desktop/3F2C3E81-E445-406F-9765-20EECA1BB88B.png").getImage().getScaledInstance(142, 140, Image.SCALE_DEFAULT)); //import the logo
        Border border = BorderFactory.createLineBorder(Color.black,1);// set border

        JLabel label1 = new JLabel();//the page title
        label1.setText("Add New");
        label1.setBounds(280,40,450,60);
        label1.setFont(new Font("Roboto",Font.BOLD,45));


        JLabel label3 = new JLabel();//the page title
        label3.setText("employee");
        label3.setBounds(340,100,450,60);
        label3.setFont(new Font("Roboto",Font.BOLD,45));


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
        label4.setBounds(200,180,200,30);
        label4.setFont(new Font("Roboto",Font.BOLD,20));
        textField1 = new JTextField();
        textField1.setBounds(300,180,170,30);
        textField1.setPreferredSize(new Dimension(250,40));
        textField1.setFont(new Font("Roboto",Font.BOLD,12));
        textField1.setForeground(Color.black);
        textField1.setBackground(Color.WHITE);
        textField1.setCaretColor(Color.BLACK);

        JLabel label5 = new JLabel();
        label5.setText("password:");
        label5.setBounds(200,230,200,30);
        label5.setFont(new Font("Roboto",Font.BOLD,20));
        textField2 = new JTextField();
        textField2.setBounds(300,230,170,30);
        textField2.setPreferredSize(new Dimension(250,40));
        textField2.setFont(new Font("Roboto",Font.BOLD,12));
        textField2.setForeground(Color.black);
        textField2.setBackground(Color.WHITE);
        textField2.setCaretColor(Color.BLACK);

        JLabel label6 = new JLabel();
        label6.setText("phone :");
        label6.setBounds(200,280,200,30);
        label6.setFont(new Font("Roboto",Font.BOLD,20));
        textField3 = new JTextField();
        textField3.setBounds(300,280,170,30);
        textField3.setPreferredSize(new Dimension(250,40));
        textField3.setFont(new Font("Roboto",Font.BOLD,12));
        textField3.setForeground(Color.black);
        textField3.setBackground(Color.WHITE);
        textField3.setCaretColor(Color.BLACK);

        JLabel label7 = new JLabel();
        label7.setText("address:");
        label7.setBounds(200,330,200,30);
        label7.setFont(new Font("Roboto",Font.BOLD,20));
        textField4 = new JTextField();
        textField4.setBounds(300,330,170,30);
        textField4.setPreferredSize(new Dimension(250,40));
        textField4.setFont(new Font("Roboto",Font.BOLD,12));
        textField4.setForeground(Color.black);
        textField4.setBackground(Color.WHITE);
        textField4.setCaretColor(Color.BLACK);


        JLabel label8 = new JLabel();
        label8.setText("salary:");
        label8.setBounds(200,380,200,30);
        label8.setFont(new Font("Roboto",Font.BOLD,20));
        textField5 = new JTextField();
        textField5.setBounds(300,380,170,30);
        textField5.setPreferredSize(new Dimension(250,40));
        textField5.setFont(new Font("Roboto",Font.BOLD,12));
        textField5.setForeground(Color.black);
        textField5.setBackground(Color.WHITE);
        textField5.setCaretColor(Color.BLACK);



        JLabel label9 = new JLabel();
        label9.setText("Working:");
        label9.setBounds(200,430,200,30);
        label9.setFont(new Font("Roboto",Font.BOLD,20));
        textField6 = new JTextField();
        textField6.setBounds(300,430,170,30);
        textField6.setPreferredSize(new Dimension(250,40));
        textField6.setFont(new Font("Roboto",Font.BOLD,12));
        textField6.setForeground(Color.black);
        textField6.setBackground(Color.WHITE);
        textField6.setCaretColor(Color.BLACK);



        this.setTitle("trip company");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(222,216,216));
        this.setLayout(null);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(button);
        this.add(button1);
        this.add(label4);
        this.add(textField1);
        this.add(label5);
        this.add(textField2);
        this.add(label6);
        this.add(textField3);
        this.add(label7);
        this.add(textField4);
        this.add(label8);
        this.add(textField5);
        this.add(label9);
        this.add(textField6);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            this.dispose();
            try {
                new welcome();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
        if (e.getSource() == button1) {
            this.dispose();
            try {
                new welcome();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

