package lt.sdacademy.javafundamentals;

import java.util.Scanner;

public class Excercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scan.nextLine();
        String sentenceNoSpaces = sentence.replace(" ", "");
        int sentenceLength = sentence.length();
        System.out.println("Sentence length  " + sentence + "ilgis" + sentenceLength);
        int sentenceSpacesLength = sentenceNoSpaces.length();
        System.out.println("SentenceSpacesLength " + sentenceNoSpaces + "zodis" + sentenceSpacesLength);
        int onlySymbolsLength = sentenceLength - sentenceSpacesLength;
        double percentage = ((double) onlySymbolsLength /sentenceLength ) * 100;
        System.out.println(percentage);


    }
}
