/*
π can be approximated by 4*(1-1/3+1/5-1/7+1/9-1/11+.....)
Write a program that displays the result of 
4*(1-1/3+1/5-1/7+1/9-1/11)
and
4*(1-1/3+1/5-1/7+1/9-1/11+1/13)
(Use 1.0 instead of 1)
*/

public class ApproximatePi {
    public static void main(String[] args) {
        double resultOne, resultTwo;
        resultOne = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        resultTwo = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));
        System.out.println("π Approximation through 1/11 is: " + resultOne);
        System.out.println("π Approximation through 1/13 is: " + resultTwo);
    }
}