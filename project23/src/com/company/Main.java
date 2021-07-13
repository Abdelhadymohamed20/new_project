package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Storage storage = new Storage();
       storage.getTripArrayFromFile();
        storage.getUSerArrayFromFile();
        storage.getEmployeeArrayFromFile();

        new welcome();



    }
}
