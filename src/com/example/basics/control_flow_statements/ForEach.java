package com.example.basics.control_flow_statements;

public class ForEach {
    public static void main(String args[]){

        String strArr[] = {"Ola","Adam","Olaf","Wiki"};

        for(String str: strArr){
            if(str.equalsIgnoreCase("Olaf"))continue;
            System.out.println(str);

        }

    }
}
