/* 
Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on the first day of school. As the students enter, the first student, denoted as S1, opens every locker. Then the second student, S2, begins with the second locker, denoted as L2, and closes every other locker. Student S3 begins with locker L3 and changes every third locker (closes it if it was open and opens it if it was closed). Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.

After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer and display all open locker numbers separated by a tab.
Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or closed (false). Initially, all lockers are closed.
*/

public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int student = 1; student <= lockers.length; student ++) {
            toggleLockersForStudent(student, lockers);
        }

        int openCount = 0;

        System.out.println("The following lockers are open.");

        for (int locker = 1; locker <= lockers.length; locker ++) {
            if (lockers[locker - 1]) {
                System.out.printf("%d\t", locker);
                openCount ++;
                if (openCount % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }

    public static void toggleLockersForStudent(int studentNumber, boolean[] lockers) {
        for (int i = studentNumber - 1; i < lockers.length; i += studentNumber) {
            // studentNumber - 1 is used because the Array starts at 0, but the studentNumber has to start with 1.
            lockers[i] = !lockers[i]; // Flips from false to true or true to false.
        }
    }
}
