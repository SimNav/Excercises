package lt.sdacademy.javafundamentals;

import java.util.Scanner;


public class Excercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String longestWord = "";
        boolean stopAplication = false;
        while (!stopAplication) {
            System.out.println("Enter word: ");
            String enteredWord = scan.nextLine();

            if (enteredWord.equals("Enough!")) {
                stopAplication = true;
                break;
            }
            if (enteredWord.length() > longestWord.length()) {
                longestWord = enteredWord;
            }

        }
        if (longestWord.equals("")) {
            System.out.println("No text Provided");
        } else {
            System.out.println("Jusu ilgiausias zodis yra: " + longestWord);
        }
    }
}
