package lt.sdacademy.javafundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Excercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        float firstNumber = scan.nextFloat();
        System.out.println("Enter action + - / or *");
        scan.nextLine();
        String action = scan.nextLine();
        System.out.println("Enter second number");
        float secondNumber = scan.nextFloat();

        switch (action) {
            case "+":
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case "/":
                if (firstNumber != 0 && secondNumber != 0) {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Cannot calculate");
                }
                break;
            case "*":
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
                break;
            default:
                System.out.println("Invalid action");
        }
    }
}
