package com.example.basic.data.types;

public class J11_2Darrays {
    public static void main(String args[]){
        String strArr[][] = {   //tablica [2] [3]  = 2 wiersze, 3 kolumny
                {"1","2","3","a"},
                {"4","5","6","d"}
        };

        System.out.println( strArr[1][3]);
        System.out.println( strArr[0][2]);

        int numArr[][] = new int[3][4];
        numArr[1][2] = 100;
        System.out.println( "numArr: " + numArr[1][2]);

        int numRows = 10;
        int numCols = 15;
        int arr[][] = new int[numRows][numCols];

    }
}
