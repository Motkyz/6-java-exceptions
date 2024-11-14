package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        //try {
            Object nullObject = null;
            nullObject.toString();
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
//        }
    }
}
