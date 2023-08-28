package com.example.basics.operators;

public class Op7_CompoundAssignmentOperators {
    public static void main(String args[]){
        //Złożone operatory przypisania
        // += -= *= /= %=

        int a = 5;
        a += 10;    // to samo co a = a + 10
        System.out.println(a);  //15

        a -= 5;
        System.out.println(a); //10

        a *= 2;
        System.out.println(a); //20

        a /= 4;
        System.out.println(a); //5

        a %= 4;
        System.out.println(a); //1



    }
}
