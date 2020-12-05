package lt.sdacademy.javafundamentals;

public class Excercise2 {

    public static void main(String[] args) {

        double weight = 88;
        double height = 1.89;
        double bmi = weight / (height * height);
        System.out.println(bmi);
        if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("BMI Optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
