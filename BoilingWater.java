import  java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp >= 100){
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
    }
}