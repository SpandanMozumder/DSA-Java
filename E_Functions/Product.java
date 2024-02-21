package E_Functions;

public class Product {
    public static void multiply(int a, int b) {
        int product = a * b;

        System.out.println("Product: " + product);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        multiply(a, b);
    }
}
