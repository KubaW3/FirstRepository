import java.math.BigDecimal;
import java.math.BigInteger;    //żeby mieć jeden import a nie całą liste
                                //wysarczy dać * ( po java.math)

public class BigIntegerBigDecimal {
    public static void main(String args[]) {

        BigInteger bigInt = new BigInteger("3278165312378178473128321");
        bigInt = bigInt.add(new BigInteger("3728173821737281738"));
        System.out.println("Wynik: " + bigInt);

        BigDecimal decimal = new BigDecimal(7321879.73812964821);
        decimal = decimal.pow(3);
        System.out.println("Wynik: " + decimal);
        System.out.println("Wynik: " + decimal.toString());

        decimal = decimal.subtract(new BigDecimal("3721372.18738111"));
        System.out.println("Wynik: " + decimal.toString());

    }
}
