package com.company;

import java.io.Serializable;

public class Employees implements Serializable {

    private String name;
    private int password;
    private int phone;
    private String address;
    private int salary;
    private String stillWorking;


    public void set_name(String name1){
        this.name = name1;
    }
    public String getData_name(){
        return name;
    }

    public void set_password(int password1){
        this.password = password1;
    }

    public int getData_password(){
        return password;
    }

    public void set_phone(int phone1){
        this.phone = phone1;
    }
    public int getData_phone(){
        return phone;
    }

    public void set_address(String address1){
        this.address = address1;
    }
    public String getData_address(){
        return address;
    }

    public void set_salary(int salary1){
        this.salary = salary1;
    }
    public int getData_salary(){
        return salary;
    }

    public void set_state(String stillWorking){
        this.stillWorking = stillWorking;
    }
    public String getData_state(){
        return stillWorking;
    }


}
