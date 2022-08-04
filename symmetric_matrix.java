// ex:11
import java.util.*;

public class symmetric_matrix {
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
            System.out.println("MATRIX");
            display(A);
            if (symmetric(A))
                System.out.println("is a Symmetric Matrix");

        } else {
            System.out.println("INVALID! try again");
            input();
        }

    }

    boolean symmetric(int a[][]) {
        boolean state = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != a[j][i])
                    state = false;
            }
        }
        return (state);
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
        symmetric_matrix obj11 = new symmetric_matrix();
        obj11.input();
    }
}
