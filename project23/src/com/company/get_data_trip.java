package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class get_data_trip extends JFrame implements ActionListener {
    JButton button;
    JButton button1;
    JTextField textField;
    int index;
    Storage storage =new Storage();

    get_data_trip() throws IOException {

        Border border = BorderFactory.createLineBorder(Color.black,1);// set border


        JLabel label3 = new JLabel();
        label3.setText("Enter trip ID:");
        label3.setBounds(230,260,200,30);
        label3.setFont(new Font("Roboto",Font.BOLD,20));
        textField = new JTextField();
        textField.setBounds(310,300,250,40);
        textField.setPreferredSize(new Dimension(250,40));
        textField.setForeground(Color.black);
        textField.setBackground(Color.WHITE);
        textField.setCaretColor(Color.BLACK);


        button = new JButton("confirm");
        button.setFont(new Font("Roboto",Font.BOLD,20));
        button.setBackground(new Color(67, 247, 205));
        button.setOpaque(true);
        button.setFocusable(false);
        button.setBorder(border);
        button.addActionListener(this);
        button.setBounds(600,480,142,41);


        button1 = new JButton("Back");
        button1.setFont(new Font("Roboto", 1, 20));
        button1.setBackground(new Color(67, 247, 205));
        button1.setOpaque(true);
        button1.setFocusable(false);
        button1.setBorder(border);
        button1.addActionListener(this);
        button1.setBounds(400, 480, 142, 41);



        this.setTitle("trip company");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.getContentPane().setBackground(new Color(191, 255, 240));
        this.setLayout(null);
        this.add(label3);
        this.add(textField);
        this.add(button);
        this.add(button1);

        this.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            this.dispose();
            try {
                index = Integer.parseInt(textField.getText());
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Exception : "+ex);
            }

            try {
                storage.getTripArrayFromFile();
                storage.getTripArrayObjectsDataShown(index);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
           // new trip_data();

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
