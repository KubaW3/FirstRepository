package com.example.basics.operators;

public class Op3_relational_operators {
    public static void main(String args[]){

        boolean b1 = 5 == 3; //false
        boolean b2 = 5 == 5; //true

        boolean b3 = 4 != 4; //false
        boolean b4 = 4 != 12; //true

        boolean b5 = 3 < 5; //true
        boolean b6 = 4 > 5; //false

        boolean b7 = 5 <= 5; //true
        boolean b8 = 4 >= 8; //false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);

//        true && true -> true
//        true && false -> false
//        false && true -> false
//        false && true -> false

        System.out.println(10 > 4 && 12 == 12); //treu + true = true
        System.out.println(10 < 4 && 12 == 12); //false + true = false
    }
}
