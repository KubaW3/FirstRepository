public class MathRoundCeilFloor {
    public static void main(String args[]){

        // zaokrąglenie do najbliższej liczby całkowitej
        System.out.println( Math.round(5.51) ); //6
        System.out.println( Math.round(5.49) ); //5

        //rzutowanie, utrata częsci ułamkowej
        System.out.println( (int) 5.45d );

        //Math.ceil - największa możliwa całkowita liczba
        System.out.println(Math.ceil(6.11)); //7
        System.out.println(Math.ceil(6.91)); //7


        //Math.floor - najmniejsza możliwa liczba całkowita
        System.out.println(Math.floor(6.99)); //6
        System.out.println(Math.floor(6.01)); //6
    }
}
