package lt.sdacademy.javafundamentals;

import java.util.Scanner;

public class Excercise13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scan.nextLine();
        String[] textArray = text.split(" ");
        for (String word : textArray) {
            for (int i = 0; i < 10; i++) {
                System.out.print(word + " ");
            }


        }
    }
}
