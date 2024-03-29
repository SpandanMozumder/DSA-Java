package E_Functions;

public class Prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));
    }
}

// public static boolean isPrime(int n) {
// int(n==2) return true;
//
// for(int i=2; i<=Math.sqrt(n); i++) {
// if(n%i==0) return false;
// }
// }
// return true;
// }