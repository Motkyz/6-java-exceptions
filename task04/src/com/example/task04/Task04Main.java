package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber / 3) {
                case 1:
                    return "весна";
                case 2:
                    return "лето";
                case 3:
                    return "осень";
                default:
                    return "зима";
            }
        } else {
            throw new MyException("monthNumber " + monthNumber +
                    " is invalid, month number should be between 1..12");
        }
    }

}