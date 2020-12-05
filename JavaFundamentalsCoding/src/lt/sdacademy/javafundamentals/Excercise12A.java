package lt.sdacademy.javafundamentals;

import java.util.Scanner;

public class Excercise12A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite sakini");
        String sakinys = scan.nextLine();

        int spaces = 0;

//        for (int raidesPozicija = 0; raidesPozicija < sakinys.length(); raidesPozicija++) {
//
//            char raideTojePozicijoje = sakinys.charAt(raidesPozicija);
//
//            if (raideTojePozicijoje == ' ') {
//                spaces++;
//            }
//
//
//        }

        for (char c : sakinys.toCharArray() ){
            if (c == ' '){
                spaces ++;
            }
        }
        double percent = ((double) spaces / sakinys.length()) * 100;
        System.out.println(percent);
    }
}
