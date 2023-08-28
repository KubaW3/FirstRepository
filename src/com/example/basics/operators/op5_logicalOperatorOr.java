package com.example.basics.operators;

public class op5_logicalOperatorOr {
    public static void main(String args[]){

        //        true && true -> true
        //        true && false -> true
        //        false && true -> true
        //        false && true -> false

        //Operator logiczny alternatywa, inaczej lub, or

        System.out.println( 10 > 2 || 5 >= 1 ); //true
        System.out.println( 9 == 9 || 3 < 1 ); //true
        System.out.println( 40 < 50 || 3 > 4 ); //true
        System.out.println( 3 > 5 || 10 == 3 ); //false
    }
}
