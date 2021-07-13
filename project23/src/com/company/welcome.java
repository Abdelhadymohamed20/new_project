package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class welcome extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    Storage storage=new Storage();
    welcome() throws IOException {

        Border border = BorderFactory.createLineBorder(Color.black,1);// set border


        button1 = new JButton("New Employee");
        button1.setFont(new Font("Roboto",Font.BOLD,20));
        button1.setBackground(new Color(67, 247, 205));
        button1.setOpaque(true);
        button1.setFocusable(false);
        button1.setBorder(border);
        button1.addActionListener(this);
        button1.setBounds(480,50,220,70);


        button2 = new JButton("Get Data of employee");
        button2.setFont(new Font("Roboto",Font.BOLD,20));
        button2.setBackground(new Color(67, 247, 205));
        button2.setOpaque(true);
        button2.setFocusable(false);
        button2.setBorder(border);
        button2.addActionListener(this);
        button2.setBounds(480,150,220,70);



        button3 = new JButton("New user");
        button3.setFont(new Font("Roboto",Font.BOLD,20));
        button3.setBackground(new Color(67, 247, 205));
        button3.setOpaque(true);
        button3.setFocusable(false);
        button3.setBorder(border);
        button3.addActionListener(this);
        button3.setBounds(250,300,220,70);



        button5 = new JButton("Get Data of user");
        button5.setFont(new Font("Roboto",Font.BOLD,20));
        button5.setBackground(new Color(67, 247, 205));
        button5.setOpaque(true);
        button5.setFocusable(false);
        button5.setBorder(border);
        button5.addActionListener(this);
        button5.setBounds(250,400,220,70);


        button4 = new JButton("New trip");
        button4.setFont(new Font("Roboto",Font.BOLD,20));
        button4.setBackground(new Color(67, 247, 205));
        button4.setOpaque(true);
        button4.setFocusable(false);
        button4.setBorder(border);
        button4.addActionListener(this);
        button4.setBounds(20,50,220,70);

        button6 = new JButton("Get Data of trip");
        button6.setFont(new Font("Roboto",Font.BOLD,20));
        button6.setBackground(new Color(67, 247, 205));
        button6.setOpaque(true);
        button6.setFocusable(false);
        button6.setBorder(border);
        button6.addActionListener(this);
        button6.setBounds(20,150,220,70);


        this.setTitle("trip company");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(191, 255, 240));
        this.setLayout(null);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button1){
            this.dispose();
            try {
                storage.getEmployeeArrayFromFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            storage.createEmployee();
            // new new_employee();
        }
        if (e.getSource()==button2){
            this.dispose();
            try {
                new get_data();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getSource()==button3){
            this.dispose();
            try {
                storage.getUSerArrayFromFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            storage.createUser();
           // new new_user();
        }

        if (e.getSource()==button4){
            this.dispose();
            try {
                storage.getTripArrayFromFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            storage.createTrip();
            //new new_trip();
        }
        if (e.getSource()==button5){
            this.dispose();
            try {
                new get_data_user();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (e.getSource()==button6){
            this.dispose();
            try {
                new get_data_trip();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

}