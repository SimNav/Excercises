package lt.sdacademy.javafundamentals;

public class Excercise5 {
    public static void main(String[] args) {
        int number = 99;

        for (int currentNumber = 1; currentNumber < number; currentNumber++) {
            boolean isPrime = true;
            for (int j = 2; j < currentNumber; j++) {
                if (currentNumber % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Number is  prime " + currentNumber);
            } else {
                System.out.println("Number is not  prime " + currentNumber);
            }
        }
    }
}