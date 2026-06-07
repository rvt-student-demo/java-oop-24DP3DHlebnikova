package rvt;

import java.util.Scanner;

public class DivisionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator: ");
            String numeratorInput = scanner.next();

            if (numeratorInput.toLowerCase().charAt(0) == 'q') {
                break;
            }

            System.out.print("Enter the divisor: ");
            String divisorInput = scanner.next();

            try {
                int numerator = Integer.parseInt(numeratorInput);
                int divisor = Integer.parseInt(divisorInput);

                if (divisor == 0) {
                    System.out.println("You can't divide " + numerator + " by 0\n");
                    continue; 
                }

                int result = numerator / divisor;
                System.out.println(numerator + " / " + divisor + " is " + result + "\n");

            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n");
            }
        }

        scanner.close();
    }
}