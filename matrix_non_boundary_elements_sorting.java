
// ex:13
import java.util.*;

public class matrix_non_boundary_elements_sorting {
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :\n \t");
        System.out.println("Enter the order of the matrix : ");
        int m = in.nextInt();
        if (m > 3 && m < 10) {
            int[][] A = new int[m][m];
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = in.nextInt();
                }
            }
            System.out.println("OUTPUT : ");
            System.out.println("ORIGINAL MATRIX :\t");
            display(A);
            System.out.println("SORTED MATRIX :\t");
            display(sort(A));
            System.out.println("DIAGONAL ELEMENTS :\t");
            diagonal(sort(A));
        } else {
            System.out.println("INVALID! try again");
            input();
        }
    }

    int[][] sort(int[][] a) {
        int aa[] = new int[(a.length - 2) * (a.length - 2)];

        int x = 0;
        out: for (int i = 0; i < a.length; i++) {
            if (x <= (a.length - 2) * (a.length - 2)) {
                in: for (int j = 0; j < a[i].length; j++) {
                    if (i != 0 && j != 0 && i != a.length - 1 && j != a.length - 1) {
                        aa[x] = a[i][j];
                        ++x;
                    }
                }
            } else {
                break out;
            }
        }
        int temp = 0;
        for (int i = 0; i < aa.length - 1; i++) {
            if (aa[i] > aa[i + 1]) {
                temp = aa[i + 1];
                aa[i + 1] = aa[i];
                aa[i] = temp;
            }
        }
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i != 0 && j != 0 && i != a.length - 1 && j != a.length - 1) {
                    a[i][j] = aa[y];
                    ++y;
                }
            }
        }
        return a;
    }

    void display(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void diagonal(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == 0 || j == 0) && (i == a.length - 1 || j == a.length - 1)) {
                    sum+=a[i][j];
                    System.out.print(a[i][j]);
                } else if ((i == 0 && j == 0) || (i == a.length - 1 && j == a.length - 1)) {
                    sum+=a[i][j];
                    System.out.print(a[i][j]);
                } else if (i != 0 && j != 0 && i != a.length - 1 && j != a.length - 1) {
                    sum+=a[i][j];
                    System.out.print(a[i][j]);
                } else {
                    System.out.print(" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = "+sum);
    }

    public static void main(String[] args) {
        matrix_non_boundary_elements_sorting obj13 = new matrix_non_boundary_elements_sorting();
        obj13.input();
    }
}
