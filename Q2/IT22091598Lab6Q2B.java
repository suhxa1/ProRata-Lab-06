import java.util.Scanner;

public class IT22091598Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            System.out.println("You entered: " + num);

            i++;
        }

        scanner.close();
    }
}