import  java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int input = sc.nextInt();
        
        //note: kapag range, mag uumpisa ka sa mababa its either 0 or anything
        if(input >= 0 && input <= menu.length){
             System.out.println(menu[input]);
        } else {
             System.out.println("Invalid");
        }
    }

}