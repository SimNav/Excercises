package lt.sdacademy.javafundamentals;

public class Excercise7 {
    public static void main(String[] args) {
        int fibonacciElement = 10;
        int lowerNumber = 1;
        int biggerNumber = 1;

        for (int i = 2; i < fibonacciElement; i++) {
            int fibonacciNumber = lowerNumber + biggerNumber;
            lowerNumber = biggerNumber;
            biggerNumber = fibonacciNumber;
            if (i == fibonacciElement - 1) {
                System.out.println(fibonacciNumber);
            }

        }
    }
}
