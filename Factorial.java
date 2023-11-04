import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++){
            fact *= i;
            //System.out.println(fact); // kapag ito nasa loob mag lloop siya
        }
            System.out.println(fact); // kapag ito nasa labas ng foor-loop isa lang ipprint niya

   }
}