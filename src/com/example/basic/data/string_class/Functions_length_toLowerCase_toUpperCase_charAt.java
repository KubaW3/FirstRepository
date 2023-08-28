package com.example.basic.data.string_class;

public class Functions_length_toLowerCase_toUpperCase_charAt {
    public static void main(String args[]){

        String str = "Ola ma kota";
        System.out.println("Ilość znaków: " + str.length());

        char sign = str.charAt(0);
        System.out.println("znak pod ideksem 0: " + sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLow = str.toLowerCase();
        System.out.println(strLow);
    }
}
