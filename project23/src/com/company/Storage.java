package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    File file = new File("Storage.txt");
    File fileUser = new File("Storage2user.txt");
    File fileEmployee = new File("Storage3employee.txt");
    ArrayList<Employees> list_of_employees = new ArrayList<>();
    ArrayList<Trips> list_of_trips = new ArrayList<>();
    ArrayList<Users> list_of_users = new ArrayList<>();
    String name_Employee;
    int password_Employee;
    int phone_Employee;
    String address_Employee;
    int salary_Employee;
    String stillWorking_Employee;
    String name_user;
    String address_user;
    int phone_user;
    int trip_index_user;
     String name_trip;
     String from_trip;
     String to_trip;
     int price_trip;
     int duration_trip;
     String season_trip;

    Employees employee = new Employees();
    Users user = new Users();
    Trips trip = new Trips();


    public Storage() throws IOException {
    }

    public void createTrip(){

        class new_trip extends JFrame implements ActionListener {

            JTextField textField1;
            JTextField textField2;
            JTextField textField3;
            JTextField textField4;
            JTextField textField5;
            JTextField textField6;




            JButton button;
            JButton button1;



            new_trip(){

                Border border = BorderFactory.createLineBorder(Color.black,1);// set border


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
                label5.setText("From:");
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
                label6.setText("TO :");
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
                label7.setText("price:");
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
                label8.setText("duration:");
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
                label9.setText("season:");
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
                this.getContentPane().setBackground(new Color(191, 255, 240));
                this.setLayout(null);
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
                    name_trip =textField1.getText();
                    from_trip = textField2.getText();
                    to_trip = textField3.getText();
                    price_trip =Integer.parseInt(textField4.getText());
                    duration_trip =Integer.parseInt(textField5.getText());
                    season_trip = textField6.getText();
                    list_trip();
                    try {
                        storingTripArrayToFile();
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
        new new_trip();
    }

    public void createUser(){

        class new_user extends JFrame implements ActionListener {


            JTextField textField1;
            JTextField textField2;
            JTextField textField3;
            JTextField textField4;


            JButton button;
            JButton button1;

            new_user(){

                Border border = BorderFactory.createLineBorder(Color.black,1);// set border


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
                label4.setBounds(200,180,200,30);
                label4.setFont(new Font("Roboto",Font.BOLD,20));
                textField1 = new JTextField();
                textField1.setBounds(290,180,170,30);
                textField1.setPreferredSize(new Dimension(250,40));
                textField1.setFont(new Font("Roboto",Font.BOLD,12));
                textField1.setForeground(Color.black);
                textField1.setBackground(Color.WHITE);
                textField1.setCaretColor(Color.BLACK);

                JLabel label5 = new JLabel();
                label5.setText("address:");
                label5.setBounds(200,230,200,30);
                label5.setFont(new Font("Roboto",Font.BOLD,20));
                textField2 = new JTextField();
                textField2.setBounds(290,230,170,30);
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
                textField3.setBounds(290,280,170,30);
                textField3.setPreferredSize(new Dimension(250,40));
                textField3.setFont(new Font("Roboto",Font.BOLD,12));
                textField3.setForeground(Color.black);
                textField3.setBackground(Color.WHITE);
                textField3.setCaretColor(Color.BLACK);

                JLabel label7 = new JLabel();
                label7.setText("trip index:");
                label7.setBounds(200,330,200,30);
                label7.setFont(new Font("Roboto",Font.BOLD,20));
                textField4 = new JTextField();
                textField4.setBounds(290,330,170,30);
                textField4.setPreferredSize(new Dimension(250,40));
                textField4.setFont(new Font("Roboto",Font.BOLD,12));
                textField4.setForeground(Color.black);
                textField4.setBackground(Color.WHITE);
                textField4.setCaretColor(Color.BLACK);



                this.setTitle("trip company");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                this.setSize(800,600);
                this.getContentPane().setBackground(new Color(191, 255, 240));
                this.setLayout(null);
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

                this.setVisible(true);
            }
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button) {
                    name_user = textField1.getText();
                    address_user =textField2.getText();
                    phone_user =Integer.parseInt(textField3.getText());
                    trip_index_user =Integer.parseInt(textField4.getText());
                    list_user();
                    try {
                        storingUserArrayToFile();
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
        new new_user();
    }

    public void createEmployee(){


        class new_employee extends JFrame implements ActionListener {


            JTextField textField1;
            JTextField textField2;
            JTextField textField3;
            JTextField textField4;
            JTextField textField5;
            JTextField textField6;


            JButton button;
            JButton button1;

            new_employee(){

                Border border = BorderFactory.createLineBorder(Color.black,1);// set border

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
                this.getContentPane().setBackground(new Color(191, 255, 240));
                this.setLayout(null);
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

                    name_Employee = textField1.getText();
                    password_Employee = Integer.parseInt(textField2.getText());
                    phone_Employee =Integer.parseInt(textField3.getText());
                    address_Employee=textField4.getText();
                    salary_Employee=Integer.parseInt(textField5.getText());
                    stillWorking_Employee=textField6.getText();
                    try {
                        list_employee();
                        storingEmployeeArrayToFile();
                        new welcome();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    // new welcome();

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
        new new_employee();

    }
    public void list_employee(){
        employee.set_name(name_Employee);
        employee.set_password(password_Employee);
        employee.set_phone(phone_Employee);
        employee.set_address(address_Employee);
        employee.set_salary(salary_Employee);
        employee.set_state(stillWorking_Employee);

        this.list_of_employees.add(employee);
    }
    public void list_user(){
        user.set_name_user(name_user);
        user.set_address(address_user);
        user.set_phone(phone_user);
        user.set_trip(trip_index_user);

        this.list_of_users.add(user);

    }

    public void list_trip(){
        trip.set_name(name_trip);
        trip.set_from(from_trip);
        trip.set_to(to_trip);
        trip.set_price(price_trip);
        trip.set_during(duration_trip);
        trip.set_season(season_trip);

        this.list_of_trips.add(trip);

    }

    public void showTripByIndexes(int index){
        int trip_index_sc = index;
        trip_index_sc = trip_index_sc - 1;
        System.out.println(list_of_trips.get(trip_index_sc).getData_name());
    }

    public void storingTripArrayToFile() throws IOException {
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        output.writeObject(list_of_trips);
        output.close();
        fo.close();
    }

    public void storingEmployeeArrayToFile() throws IOException {
        FileOutputStream fo = new FileOutputStream(fileEmployee);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        output.writeObject(list_of_employees);
        output.close();
        fo.close();
    }

    public void storingUserArrayToFile() throws IOException {
        FileOutputStream fo = new FileOutputStream(fileUser);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        output.writeObject(list_of_users);
        output.close();
        fo.close();
    }

    public void getTripArrayFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        list_of_trips = (ArrayList<Trips>) objectInput.readObject();
        System.out.println("The size of trips array is " + list_of_trips.size());
    }

    public void getEmployeeArrayFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream(fileEmployee);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        list_of_employees = (ArrayList<Employees>) objectInput.readObject();
        System.out.println("The size of Employees array is " + list_of_employees.size());
    }

    public void getUSerArrayFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream(fileUser);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        list_of_users = (ArrayList<Users>) objectInput.readObject();
        System.out.println("The size of Users array is " + list_of_users.size());
    }

    public void getTripArrayObjectsDataShown(int index) throws IOException, ClassNotFoundException {
        index = index - 1;
        Trips trips = new Trips();
        trips = list_of_trips.get(index);

        Trips finalTrips = trips;
        class trip_data extends JFrame implements ActionListener {
            JButton button;
            JButton button1;
            trip_data() throws IOException, ClassNotFoundException {

                Border border = BorderFactory.createLineBorder(Color.black,1);// set border


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

                label17.setText(finalTrips.getData_name());

                label17.setBounds(350,170,200,30);
                label17.setFont(new Font("Roboto",Font.BOLD,20));


                JLabel label5 = new JLabel();
                label5.setText("From:");
                label5.setBounds(250,220,200,30);
                label5.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label18 = new JLabel();
                label18.setText(finalTrips.getData_from());
                label18.setBounds(350,220,200,30);
                label18.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label6 = new JLabel();
                label6.setText("to:");
                label6.setBounds(250,270,200,30);
                label6.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label19 = new JLabel();
                label19.setText(finalTrips.getData_to());
                label19.setBounds(350,270,200,30);
                label19.setFont(new Font("Roboto",Font.BOLD,20));


                JLabel label7 = new JLabel();
                label7.setText("price:");
                label7.setBounds(250,320,200,30);
                label7.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label20 = new JLabel();
                label20.setText(String.valueOf(finalTrips.getData_price()));
                label20.setBounds(350,320,200,30);
                label20.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label8 = new JLabel();
                label8.setText("duration:");
                label8.setBounds(250,370,200,30);
                label8.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label21 = new JLabel();
                label21.setText(String.valueOf(finalTrips.getData_during()));
                label21.setBounds(350,370,200,30);
                label21.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label9 = new JLabel();
                label9.setText("season:");
                label9.setBounds(250,420,200,30);
                label9.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label22 = new JLabel();
                label22.setText(finalTrips.getData_season());
                label22.setBounds(350 ,420,200,30);
                label22.setFont(new Font("Roboto",Font.BOLD,20));


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
                    try {
                        new welcome();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                }
                if (e.getSource() == button1) {
                    this.dispose();
                    try {
                        new get_data_trip();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        }
        new trip_data();

    }

    public void getEmployeeArrayObjectsDataShown(int index){
        index = index - 1;
        Employees employees = new Employees();
        employees = list_of_employees.get(index);
        Employees finalEmployee =employees;
        class employee_data extends JFrame implements ActionListener {

            JButton button;
            JButton button1;

            employee_data(){

                Border border = BorderFactory.createLineBorder(Color.black,1);// set border


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
                label17.setText(finalEmployee.getData_name());
                label17.setBounds(350,170,200,30);
                label17.setFont(new Font("Roboto",Font.BOLD,20));


                JLabel label5 = new JLabel();
                label5.setText("password:");
                label5.setBounds(250,220,200,30);
                label5.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label18 = new JLabel();
                label18.setText(String.valueOf(finalEmployee.getData_password()));
                label18.setBounds(350,220,200,30);
                label18.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label6 = new JLabel();
                label6.setText("phone:");
                label6.setBounds(250,270,200,30);
                label6.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label19 = new JLabel();
                label19.setText(String.valueOf(finalEmployee.getData_phone()));
                label19.setBounds(350,270,200,30);
                label19.setFont(new Font("Roboto",Font.BOLD,20));


                JLabel label7 = new JLabel();
                label7.setText("address:");
                label7.setBounds(250,320,200,30);
                label7.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label20 = new JLabel();
                label20.setText(finalEmployee.getData_address());
                label20.setBounds(350,320,200,30);
                label20.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label8 = new JLabel();
                label8.setText("salary:");
                label8.setBounds(250,370,200,30);
                label8.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label21 = new JLabel();
                label21.setText(String.valueOf(finalEmployee.getData_salary()));
                label21.setBounds(350,370,200,30);
                label21.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label9 = new JLabel();
                label9.setText("working:");
                label9.setBounds(250,420,200,30);
                label9.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label22 = new JLabel();
                label22.setText(finalEmployee.getData_state());
                label22.setBounds(350 ,420,200,30);
                label22.setFont(new Font("Roboto",Font.BOLD,20));


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
                    try {
                        new welcome();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

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
        new employee_data();
    }

    public void getUserArrayObjectsDataShown(int index){
        index = index - 1;
        Users users = new Users();
        users = list_of_users.get(index);
        Users finalUser =users;
        class user_data extends JFrame implements ActionListener  {
            JButton button;
            JButton button1;

            user_data(){

                Border border = BorderFactory.createLineBorder(Color.black,1);// set border


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
                label17.setText(finalUser.getData_name_user());
                label17.setBounds(350,170,200,30);
                label17.setFont(new Font("Roboto",Font.BOLD,20));


                JLabel label5 = new JLabel();
                label5.setText("phone:");
                label5.setBounds(250,220,200,30);
                label5.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label18 = new JLabel();
                label18.setText(String.valueOf(finalUser.getData_phone()));
                label18.setBounds(350,220,200,30);
                label18.setFont(new Font("Roboto",Font.BOLD,20));

                JLabel label6 = new JLabel();
                label6.setText("address:");
                label6.setBounds(250,270,200,30);
                label6.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label19 = new JLabel();
                label19.setText(finalUser.getData_address());
                label19.setBounds(350,270,200,30);
                label19.setFont(new Font("Roboto",Font.BOLD,20));


                JLabel label7 = new JLabel();
                label7.setText("trip index:");
                label7.setBounds(250,320,200,30);
                label7.setFont(new Font("Roboto",Font.BOLD,20));
                JLabel label20 = new JLabel();
                label20.setText(String.valueOf(finalUser.get_trip()));
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
                    try {
                        new welcome();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                }
                if (e.getSource() == button1) {
                    this.dispose();
                    try {
                        new get_data_user();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        }
        new user_data();
    }

}


