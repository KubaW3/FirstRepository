package com.example.basic.data.string_class;

import javax.swing.text.GlyphView;

public class Functions_startWith_endWith {
    public static void main(String args[]) {

        String str = "Java program";

        if (str.startsWith("PHP")) System.out.println("starts with PHP");

        if (str.startsWith("Java")) System.out.println("Starts with Java");

        if(str.endsWith("program")) System.out.println("Ends with program");

    }
}
