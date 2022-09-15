
// ex:15
import java.util.*;

public class matrix_sorting {
    int[][] A;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :\n \t");
        System.out.println("Enter the order of the matrix : ");
        int m = in.nextInt();
        int n = in.nextInt();
        if (m > 2 && n > 2 && m < 10 && n < 10) {
            A = new int[m][n];
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = in.nextInt();
                }
            }
            System.out.println("OUTPUT : ");
            System.out.println("ORIGINAL MATRIX");
            display(A);
            System.out.println("MATRIX AFTER SORTING ROWS");
            display(sort(A));
        } else {
            System.out.println("INVALID! try again");
            input();
        }

    }

    int[][] sort(int[][] A) {
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length - 1; j++) {
                if (A[i][j] > A[i][j + 1]) {
                    temp = A[i][j + 1];
                    A[i][j + 1] = A[i][j];
                    A[i][j] = temp;
                }
            }
        }
        return A;
    }

    void display(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        matrix_sorting obj15 = new matrix_sorting();
        obj15.input();
    }
}
