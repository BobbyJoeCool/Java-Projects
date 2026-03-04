/* 
A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and also a palindromic prime, as are 313 and 757. Write a program that displays the first 100 palindromic prime numbers. Display 10 numbers per line, separated by a tab.
*/

public class PalindromicPrime {
    public static void main(String[] args) {
        int count = 0;
        int n = 11;
        while (count < 100) {
            if (isPalindrome(String.valueOf(n)) && isPrime(n)) {
                System.out.printf("%d\t", n);
                count ++;
                if (count % 10 == 0) {
                    System.out.print("\n");
                }
            }
            n ++;
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // means the number is divisible by this integer.
                return false;
            }
        }

        return true;
    }
}
