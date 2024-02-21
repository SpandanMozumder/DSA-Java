package E_Functions;

public class BinomialCoefficient {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = multiply(fact, i);
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int result = binomialCoefficient(n, k);
        System.out.println("Binomial Coefficient of (" + n + ", " + k + ") = " + result);
    }

}
