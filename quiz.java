
// ex:14
import java.util.*;

public class quiz {
    String A[][];
    int score[];
    String k[] = new String[5];

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :\n \t");
        System.out.println("Enter the order of the matrix : ");
        int m = in.nextInt();
        if (m > 3 && m < 11) {
            A = new String[m][5];
            score = new int[m];
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < A.length; i++) {
                System.out.println("Participant " + (i + 1));
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = in.next();
                }
            }
            System.out.println("Key: ");
            for (int i = 0; i < k.length; i++) {
                k[i] = in.next();
            }
            System.out.println("OUTPUT : ");
            check(A);
        } else {
            System.out.println("INVALID! try again");
            input();
        }

    }

    void check(String[][] A) {
        int big = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j].equals(k[j])) {
                    score[i] += 1;
                }
            }
            System.out.println("Participant " + (i + 1) + " = " + score[i]);
            if (score[i] > big)
                big = i;
        }
        System.out.println("Highest Score:\nParticipant " + (++big));
    }

    public static void main(String[] args) {
        quiz obj14 = new quiz();
        obj14.input();
    }
}
