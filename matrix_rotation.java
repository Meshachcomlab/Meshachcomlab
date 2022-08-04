// ex:12
import java.util.*;

public class matrix_rotation {
    int A[][];

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :\n \t");
        System.out.println("Enter the order of the matrix : ");
        int m = in.nextInt();
        if (m > 2 && m < 10) {
            A = new int[m][m];
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = in.nextInt();
                }
            }
            System.out.println("OUTPUT : ");
            System.out.println("ORIGINAL MATRIX");
            display(A);
            System.out.println("ROTATED MATRIX ");
            display(rotate(A));

        } else {
            System.out.println("INVALID! try again");
            input();
        }

    }

    int[][] rotate(int a[][]) {
        int b[][] = new int[a.length][a.length];
        int x = 0;
        for (int i = 0; i < b.length; i++) {
            x = b.length - 1;
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[x][i];
                x--;
            }
        }
        return (b);
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
        matrix_rotation obj12 = new matrix_rotation();
        obj12.input();
    }
}
