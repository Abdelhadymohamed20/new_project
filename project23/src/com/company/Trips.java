package com.company;

import java.io.Serializable;

public class Trips  implements Serializable {

    private String name_trip;
    private String from;
    private String to;
    private int price;
    private int duration;
    private String season;
    private boolean state;

    public void set_name(String name1){
        this.name_trip = name1;
    }
    public String getData_name(){
        return name_trip;
    }

    public void set_from(String from1){
        this.from = from1;
    }
    public String getData_from(){
        return from;
    }

    public void set_to(String to1){
        this.to = to1;
    }
    public String getData_to(){
        return to;
    }

    public void set_price(int price1){
        this.price = price1;
    }
    public int getData_price(){
        return price;
    }

    public void set_during(int duration1){
        this.duration = duration1;
    }
    public int getData_during(){
        return duration;
    }

    public void set_season(String season1){
        this.season = season1;
    }
    public String getData_season(){
        return season;
    }

    public void set_state(boolean state1){
        this.state = state1;
    }
    public boolean getData_state(){
        return state;
    }
}
