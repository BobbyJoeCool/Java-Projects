/* 
A prime number is called a Mersenne prime if it can be written in the form (2^p)−1 for some positive integer p. Write a program that finds all Mersenne primes with p≤31 and displays the output as follows:

p   2^p -1
2   3
3   7
5   31
*/

public class MersennePrime {
    public static void main(String[] args) {
        System.out.printf("%-5s %-10s%n", "p", "2^p - 1");
        System.out.println("----------------");

        for (int p = 2; p <= 31; p++) {
            int number = (int)Math.pow(2, p) - 1;
            if (isPrime(number)) {
                System.out.printf("%-5d %-10d%n", p, number);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) { // means the number is divisible by this integer.
                return false;
            }
        }

        return true;
    }
}
