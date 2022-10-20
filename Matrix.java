import java.util.*;

public class Matrix {
    int M;
    int A[][];

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT \t m = ");
        M = in.nextInt();
        if (M > 2 && M < 10) {
            A = new int[M][M];
            for (int i = 0; i <= A.length - 1; i++) {
                for (int j = 0; j <= A.length - 1; j++) {
                    A[i][j] = in.nextInt();
                }
            }
        } else {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE");
            input();
        }
    }

    void display() {
        System.out.println("ORIGINAL MATRIX");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    int cal() {
        int sum = 0;

        for (int i = 0; i <= A.length - 1; i++) {
            for (int j = 0; j <= A.length - 1; j++) {
                if (i == 0 || j == 0 || i == A.length - 1 || j == A.length - 1) {
                    sum += A[i][j];
                }
            }
        }
        return sum;
    }

    void diagonal() {
        System.out.println("DIAGONAL ELEMENTS");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j)
                    System.out.print(A[i][j] + " ");
                else if ((i + j) == A.length - 1)
                    System.out.print(A[i][j] + " ");
                else if ((i == 0 || j == 0) && (i == A.length - 1 || j == A.length - 1))
                    System.out.print(A[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("SUM OF THE BOUNDARY ELEMENTS = " + cal());
    }

    public static void main(String[] args) {
        Matrix obj = new Matrix();
        obj.input();
        obj.display();
        obj.diagonal();
    }
}
