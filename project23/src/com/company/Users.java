package com.company;

import java.io.Serializable;

public class Users implements Serializable {
    private String name_user;
    private int phone_user;
    private String address_user;
    private int trip_index;

    public void set_name_user(String name2){
        this.name_user = name2;
    }
    public String getData_name_user(){
        return name_user;
    }

    public void set_phone(int phone2){
        this.phone_user = phone2;
    }
    public int getData_phone(){
        return phone_user;
    }

    public void set_address(String address2){
        this.address_user = address2;
    }
    public String getData_address(){
        return address_user;
    }

    public void set_trip(int index){
        this.trip_index = index;
    }
    public int get_trip(){
        return trip_index;
    }
}
