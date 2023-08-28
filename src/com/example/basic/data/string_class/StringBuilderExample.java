package com.example.basic.data.string_class;

public class StringBuilderExample {
    public static void main(String args[]){

        StringBuilder builder = new StringBuilder();
        builder.append("Wiki ma Kleosie").append(777);
        builder.append("tralalla");

            //taki sposób dodwania Stringa ułatwia prace programowi
            //normalnie dodając coś do zmiennej String program kasuje
            //poprzedniego stringa(zwalnia pamięć) i na nowo to zapisuje
            //tutaj tylko dopisujemy

        builder.insert(0,"Kasia ma psa.");

        System.out.println(builder.toString());

        builder.replace(0, 5, "Julia");
        System.out.println(builder.toString());

        builder.insert(12, "  i kota ");
        System.out.println(builder.toString());

        int index = builder.indexOf("777");
        System.out.println(index);
        builder.delete(index, builder.length());
        System.out.println(builder.toString());


    }
}
