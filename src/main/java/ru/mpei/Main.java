package ru.mpei;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date();
        System.out.println(date1.getTime()-date.getTime());
    }
}
