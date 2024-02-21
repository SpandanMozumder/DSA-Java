import java.util.*;

public class B_ConditionalStatements {

    public static void main1(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("You are an adult");
        }
        if (age > 13 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a minor");
        }
    }

    public static void main2(String[] args) {
        int A = 10;
        int B = 5;

        if (A > B) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main4(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age > 13 && age < 18) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a minor");
        }
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if (income < 50000) {
            tax = 0;
        } else if (income >= 50000 && income < 100000) {
            tax = (int) (0.2 * income);
        } else {
            tax = (int) (0.3 * income);
        }

        System.out.println("Tax is: " + tax);
    }

    public static void main6(String[] args) {
        int A = 1, B = 3, C = 6;

        if (A >= B && A >= C) {
            System.out.println("A is the largest number");
        } else if (B >= A && B >= C) {
            System.out.println("B is the largest number");
        } else {
            System.out.println("C is the largest number");
        }
    }

    public static void main7(String[] args) {
        int number = 4;

        String type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
    }

    public static void main8(String[] args) {
        int mark = 67;

        String reportCard = (mark >= 90) ? "A" : (mark >= 80) ? "B" : (mark >= 70) ? "C" : (mark >= 60) ? "D" : "F";
        System.out.println(reportCard);
    }

    public static void main9(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
            default:
                System.out.println("We wake up");
        }
    }

    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int A = sc.nextInt();
        System.out.println("Enter B:");
        int B = sc.nextInt();
        System.out.println("Enter operation:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.println(A / B);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("x is greater than 0");
        } else {
            System.out.println("x is less or equal to 0");
        }
    }

    public static void main12(String[] args) {
        double temp = 103.5;

        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You do not have a fever");
        }
    }

    public static void main13(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week numbers (1-7):");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week number");
        }

        public static void main14(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the year:");
            int year = sc.nextInt();

            boolean x = (year % 4) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 == 0));

            if(x && (y || z)){
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }            
        }
    }
}
