public class NumbersConversion {
    public static void main(String args[]){

        //konwersja jawna - zawężająca
        // to taka kiedy programista pokazuje
        //na jaką zmienną zmienić konkrętną zmienną

        int i = 5;
        double d = 20.0d / (double)i;
        System.out.println(d);

        //konwersja niejawna - rozszerzająca
        //dzieje się automatycznie bo robi to java

        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        double d2 = 5.9;        //ucina koncowke ! NIE ZAOKRĄGLA !
        int num = 10 * (int)d2; //do zaokrąglania służy "Math.round"
        System.out.println(num);

        byte small = (byte)200;     //rzutowanie
        System.out.println("small: " + small);

        double f = 31.71;

        System.out.println(f);
        System.out.println(Math.round(f));
        System.out.println(Math.ceil(f));
        System.out.println(Math.floor(f));

    }
}
