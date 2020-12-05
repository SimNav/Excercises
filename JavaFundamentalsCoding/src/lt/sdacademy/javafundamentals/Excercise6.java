package lt.sdacademy.javafundamentals;

public class Excercise6 {
    public static void main(String[] args) {
        int maxValue =  10;
        double sum = 0;
        for (double i = 1; i < maxValue; i++){
            double x =  1 / i;
            sum += x;

        }
        System.out.println(sum);
    }
}
