package E_Functions;
import java.util.Scanner;

public class Factorial {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = multiply(fact, i);
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
