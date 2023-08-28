package com.example.basic.data.string_class;

public class Function_lastIndexOf {
    public static void main(String args[]){

        String str = "raz dwa trzy cztery, raz dwa.";

        int index = str.lastIndexOf("raz");
        System.out.println("Ostatnie wysąpienie 'raz': " + index);
        String fragment = str.substring(index);
        System.out.println("fragment: " + fragment);

        index  = str.indexOf("raz");
        System.out.println("Pierwsze wystąpienie 'raz': " + index);

    }
}
