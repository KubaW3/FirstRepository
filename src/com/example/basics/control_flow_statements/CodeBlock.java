package com.example.basics.control_flow_statements;

public class CodeBlock {
    public static void main(String args[]){

        int b = 12;
        int num = 100;

        if( 5 < 10 )
        {
//            long num = 1000;  Wywali błąd bo taka zmienna
//                              istnieje przed blokiem kodu
           int a = 5;
           System.out.println("a :" + a);
           System.out.println("b: " + b);
//         System.out.println("c: " + c); Deklaracja zmiennej c jest po
//                                         wywołaniu przez co wywala błąd


        }

        int c = 7;

        int a = 99; // nie ma konfliktu nazw bo wcześniejsza zmianna a
                    // jest w innym bloku

    }
}
