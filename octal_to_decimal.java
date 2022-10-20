
// ex:17
import java.util.*;

public class octal_to_decimal {
    int[][] A;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :\n \t");
        System.out.print("Enter the order of the matrix : \nM = ");
        int m = in.nextInt();
        System.out.print("N = ");
        int n = in.nextInt();
        if (m > 0 && m < 10 && n > 2 && n < 6) {
            A = new int[m][n];
            for (int i = 0; i < A.length; i++) {
                System.out.println("Enter the elements for Row " + (i + 1) + " :\n");
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = in.nextInt();
                }
            }
        } else {
            System.out.println("INVALID! try again");
            input();
        }
    }

    void conversion() {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
                sum += (int) (A[i][(A[i].length - 1) - j] * Math.pow(8, j));
            }
            System.out.println(sum + "\t");
        }
    }

    public static void main(String[] args) {
        octal_to_decimal obj17 = new octal_to_decimal();
        obj17.input();
        System.out.println("\nOUTPUT: \n FILLED MATRIX DECIMAL EQUIVATION: ");
        obj17.conversion();
    }
}
