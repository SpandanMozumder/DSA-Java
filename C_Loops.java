import java.util.*;

public class C_Loops {

    public static void main1(String[] args) {
        // While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // For Loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10899;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
        System.out.println();
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10899;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println("Reverse: " + rev);
    }

    public static void main6(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
    }

    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }

    public static void main8(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was : " + n);
        } while (true);
    }

    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter a number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to continue? 1. Yes 2. No");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.println("Enter a number");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
