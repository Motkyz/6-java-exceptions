package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(getSeason(i));
        }
        getSeason(-1);
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
            throw new IllegalArgumentException("monthNumber " + monthNumber +
                    " is invalid, month number should be between 1..12");
        }
    }
}