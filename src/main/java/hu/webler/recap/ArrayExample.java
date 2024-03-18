package hu.webler.recap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kezdő szám: ");
        int start = scanner.nextInt();
        System.out.println("Végszám: ");
        int end = scanner.nextInt();

        int length = countNumber(start, end); //meg kell számolnom, hogy hány szám jön szóba közben!
        int[] numbers = new int[length];
        int index = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                numbers[index] = i;
                index++;
                }
            }
        System.out.println(Arrays.toString(numbers));
        }


        // tömb nehézsége: előre kell tudni a hosszát.


    private static int countNumber(int start, int end) {
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}

