package lt.sdacademy.javafundamentals;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Iveskite diametra");
        float diameter = scan.nextFloat();
        float r = diameter / 2;
        double pi = Math.PI;
        double perimeter = 2 * pi * r;
        System.out.println("Perimetras yra: " + perimeter);
        scan.close();
    }
}
