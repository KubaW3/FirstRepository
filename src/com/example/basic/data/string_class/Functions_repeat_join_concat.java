package com.example.basic.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String args[]){

        String str = "info";
        str = str.repeat(3);
        System.out.println(str);

        String JoinedText = String.join(" - ", "raz","dwa","trzy");
        System.out.println(JoinedText);

        String text = "Ola ".concat("ma") + " kota ".concat(".");
        System.out.println(text);




    }
}
