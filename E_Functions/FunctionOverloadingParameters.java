package E_Functions;

public class FunctionOverloadingParameters {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int multiply(int a, int b, int c) {
        int product = a * b * c;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        int result1 = multiply(a, b);
        int result2 = multiply(a, b, c);
        System.out.println("Product of " + a + " and " + b + " = " + result1);
        System.out.println("Product of " + a + ", " + b + " and " + c + " = " + result2);
    }
}