package com.example.basic.data.types;

public class J10_arrays {
    public static void main(String args[]){
        int numArr[] = new int[10];
        numArr[1] = 7;
        System.out.println("nummArr[1]: " + numArr[1]
                + " nummArr.length: " + numArr.length);

        float floatsArr[] = {10.0f, 444.1f, 31.31f, -100.607f, 1.5f};
        floatsArr[0] = 1.0f;

        System.out.println("floatsArr[1]: " +floatsArr[1]
                + " floatsArr.length: " + floatsArr.length);

        String strArr[] = new String[7];
        System.out.println("strArr[1]: " + strArr[1]);

        String namesArr[] = {"Ola", "Ania", "Karol"};
        System.out.println("namesArr[1]: " + namesArr[1]);
    }

}
