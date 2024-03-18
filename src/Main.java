import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/

        // Creating Scanner object

        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the subtotal and the gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuityRate = sc.nextDouble();

        //// Calculate gratuity and total

        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;

        // Display results
        System.out.println("The gratuity is $" + gratuity +
                " and total is $" + total);




    }

}