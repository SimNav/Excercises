package lt.sdacademy.javafundamentals;

import java.util.Scanner;

public class Excercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Write a number");
        int number = scan.nextInt();
        scan.close();
        if (number > 0) {
            while (number > 0) {
                int remainder = 0;
                remainder = number % 10;
                number /= 10;
                sum += remainder;
            }
        } else {
            System.out.println("Wrong input");
        }
        System.out.println(sum);
    }
}
