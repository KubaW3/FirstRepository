package com.example.basic.data.string_class;

public class StringBasicExmaples {
    public static void main(String args[]){

        String s1 = "Hello World!";
        String s2 = new String("String passed to constructor");

        String s3 = "test".repeat(3);
        System.out.println(s3);

        String s4 = String.join(".","1","2","3","4","5");
        System.out.println(s4);

        char arr[] = {'0', 'L', 'A'};
        String s5 = new String(arr);
        System.out.println(s5);

    }
}
