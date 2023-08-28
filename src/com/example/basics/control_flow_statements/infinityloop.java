package com.example.basics.control_flow_statements;

public class infinityloop {
    public static void main(String args[]){
        while(true){
            int random = (int)Math.round(18 * Math.random());
            System.out.println(random);

            if(random == 10){
                System.out.println("Wyjście z pętlki while");
                break;
            }

        }

        for( ; ; ){
            int random =  (int)Math.round(10 * Math.random());
            System.out.println(random);
            if(random == 3 || random == 8){
                System.out.println("wyjście z pętlki for");
                break;
            }

        }
    }
}
