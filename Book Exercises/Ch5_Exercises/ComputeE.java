/* 
You can approximate e using the following summation:
e=1+1/1!+1/2!+1/3!+1/4!+…+1/i!
Write a program that displays the e value for i = 1, 2, …, and 20. Format the number to display 16 digits after the decimal point. (Hint: Because i!=i×(i−1)×…×2×1, then
1i!is1i(i−1)!Initialize e and item to be 1, and keep adding a new item to e. The new item is the previous item divided by i, for i >= 2.)
*/

public class ComputeE {
    public static void main(String[] args) {
        double e = 1.0;
        double item = 1.0;
        
        for (int i = 1; i <= 20; i ++) {
            item /= i;
            e += item;
            System.out.printf("for i = %d the value of e is %.16f %n", i, e);
        }
    }
}


