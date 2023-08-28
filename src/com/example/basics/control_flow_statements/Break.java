package com.example.basics.control_flow_statements;

public class Break {
    public static void main(String[] args){
        for(int i = 0; i < 20; i++){
            System.out.println(i * 5);

            if( i > 12) break;
        }

        System.out.println("Dalsza część programu");


        int a = 10;

        while(a > 0){
            System.out.println(a);
            a--;

            if(a == 1) System.out.println("start");
            if(a == 1) break;
        }


    }
}
