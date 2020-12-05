package lt.sdacademy.javafundamentals;

import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        int generateTill = 30;

        for (int i = 1; i < generateTill; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 7 == 0) {
                System.out.println("Buzz "+ i);
            }
        }
    }
}
