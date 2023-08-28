package com.example.basics.operators;

public class Op2_incrementation_decremetantio {
    public static void main(String args[]){
        int  a1 = 10;
        int  a2 = 10;
        int  a3 = 10;
        int  a4 = 10;

        a1++;
        ++a2;
        a3--;
        --a4;

        System.out.println("a++: " + a1);
        System.out.println("++a: " + a2);
        System.out.println("a--: " + a3);
        System.out.println("--a: " + a4);

        int b = 5;          //inkrementacja przyrosktowa
        int c = 10 + b++;   //najpierw robi działanie potem dodaje 1(++)
        System.out.println("c: " + c);

        int d = 5;          //inkrementacja przedrostkowa
        int e = 10 + ++d;   //najpierw dodaje 1(++) potem robi działanie
        System.out.println("e: " + e);

    }
}
