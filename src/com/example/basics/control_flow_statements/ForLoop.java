package com.example.basics.control_flow_statements;

public class ForLoop {
    public static void main(String[] args){

        int arr[] = {1,5,10,15,20,25,30,35,40};

        for (int i = 0; i < arr.length; i ++){
           int value = arr[i];
            System.out.println("arr: " + value);
        }

        String names[] = {"Ola","Wiki","Kasia","Olaf"};

        for(int i = names.length - 1; i >= 0; i--){
            String str = names[i];
            System.out.println("Imię: " + str);
        }

    }
}
