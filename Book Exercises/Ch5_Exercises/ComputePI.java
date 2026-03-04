/* 
You can approximate π by using the following summation:
π=4 * (1−1/3+1/5−1/7+1/9−1/11+…+(−)i+1/2i−1)
Write a program that displays the π value for i = 10000, 20000, …, and 100000.
*/

public class ComputePI {
    public static void main(String[] args) {
        double pi =0 ;
        double sum = 0;
        int i;

        for (i = 1; i <= 100000; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / ((2 * i) - 1);
            } else {
                sum -= 1.0 / ((2 * i) - 1);
            }

            if (i % 10000 == 0) {
                pi = 4 * sum;
                System.out.println("The value of π for i = " + i + " is: " + pi);
            }
        }
    }
}
