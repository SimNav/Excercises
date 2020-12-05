package lt.sdacademy.javafundamentals;

public class Excercise3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int c = 8;

        double delta = (b * b) - 4 * a * c;
        System.out.println(delta);
        double x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);

        if(delta< 0){
            System.out.println("Delta is negative");
        } else if (delta> 0) {
            System.out.println("x1 = "+  x1 + "\nx2 = "+ x2);
        }
    }
}
