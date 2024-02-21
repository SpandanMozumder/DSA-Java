import java.util.Scanner;

public class A_JavaBasics {

    public static void main1(String args[]) {
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World");
    }

    public static void main2(String args[]) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void main3(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);

        String name = "Tony Stark";
        System.out.println(name);

        a = b;
        System.out.println(a);
    }

    public static void main4(String args[]) {
        int a = 10;
        int b = 5;

        int sum = a + b;

        System.out.println(sum);
    }

    public static void main5(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
    }

    public static void main6(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }

    public static void main7(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;

        System.out.println(product);
    }

    public static void main8(String args[]) {
        Scanner sc = new Scanner(System.in);

        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;

        System.out.println(area);
    }

    public static void main9(String args[]) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextInt();

        System.out.println(num);
    }

    public static void main10(String args[]) {
        Scanner sc = new Scanner(System.in);

        float marks = 99.999f;
        int marks2 = (int) marks;

        System.out.println(marks);
        System.out.println(marks2);
    }

    public static void main11(String args[]) {
        Scanner sc = new Scanner(System.in);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;

        System.out.println(number);
        System.out.println(number2);
    }

    public static void main12(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;

        double ans = a + b + c + d;

        System.out.println(ans);
    }

    public static void main13(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A + B + C) / 3;

        System.out.println("Average is : " + average);
    }

    public static void main14(String args[]) {
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of the square is : " + area);
    }

    public static void main15(String args[]) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float newTotal = total + (total * 0.18f);
        System.out.println("Bill with 18% tax : " + newTotal);
    }
}