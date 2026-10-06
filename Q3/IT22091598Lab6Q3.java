import java.util.Scanner;

public class IT22091598Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sumOfSquares = 0.0;

        System.out.println("Enter positive integers.");
        System.out.println("Enter -99 to terminate.");

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }

            sumOfSquares += Math.pow(num, 2);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}