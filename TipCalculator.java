import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        double total = (amount * 15) / 100;
        System.out.println("Total: " + total);
        
    }
}