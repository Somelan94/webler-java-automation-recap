package hu.webler.cast;

public class Casting {
    public static void main(String[] args) {

        // példa egész szám átalakítása lebegőpontossá

        int intValue = 10;
        double doubleValue = (double) intValue;
        System.out.println("int érték: " + intValue);
        System.out.println("double érték: " + doubleValue);

        System.out.println("-----------------");

        double pi = 3.14;
        int intValueOfPi = (int) pi;
        System.out.println("double érték: " + pi);
        System.out.println("Int érték: " + intValueOfPi);  // elveszik a tizedes jegy után minden, adatvesztéssel járhat

        char letter = 'A';
        int intValueFromChar = (int) letter;
        System.out.println(letter);
        System.out.println(intValueFromChar);







    }
}
