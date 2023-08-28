package com.example.basics.control_flow_statements;

public class SwitchInstructions {
    public static void main(String args[]){

        enum CarVariant {SEDAN, COMBI, CABRIO}

        int num = 102;
        switch ( num ) {
            case 1:
                System.out.println("num: " + num);
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("num = " + num);
        }

        String str = "Ania";

        switch (str){
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            case "Olaf":
                System.out.println("Olaf");
                break;
        }

        CarVariant car = CarVariant.COMBI;

                switch(car){
                    case COMBI:
                        System.out.println(CarVariant.COMBI);
                        break;
                    case SEDAN:
                        System.out.println(CarVariant.SEDAN);
                        break;
                    default:
                        System.out.println(CarVariant.CABRIO);
                }

    }
}
