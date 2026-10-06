import java.util.Scanner;

public class IT22091598Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        double square = Math.pow(num, 2);

        System.out.println("The square of " + num + " is: " + square);

        if (num >= 0) {
            double squareRoot = Math.sqrt(num);
            System.out.println("The square root of " + num + " is: " + squareRoot);
        } else {
            System.out.println("Square root is not a real number for a negative input.");
        }

        scanner.close();
    }
}