package com.example.basics.control_flow_statements;

public class TerrnaryOperator {
    public static void main(String[] args){
        int a = 8;
        int b = (a > 3) ? 100 : 10;
        System.out.println("b: " + b);

        int a1 = 2;
        int b1 = (a1 > 3) ? 100 : 10;
        System.out.println("b1: " + b1);

//        Zamiast if else można zastosować zapis skrócony
//        if -> ?, else -> :
    }
}
