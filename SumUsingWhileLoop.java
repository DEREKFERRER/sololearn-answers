import  java.util.Scanner;

public class SumUsingWhileLoop {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), i = 1, sum = 0;
        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }

}