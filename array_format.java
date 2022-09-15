
// ex:16
import java.util.*;

public class array_format {
    int al[];
    int[][] A;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT:");
        System.out.print("N = ");
        int n = (in.nextInt());
        al = new int[n];
        A = new int[n][n];
        System.out.println("ENTER ELEMENTS OFD SINGLE DIMENSION ARRAY : ");
        for (int i = 0; i < al.length; i++) {
            al[i] = in.nextInt();
        }
        int tmp = 0;
        for (int i = 0; i < al.length - 1; i++) {
            if (al[i] > al[i + 1]) {
                tmp = al[i + 1];
                al[i + 1] = al[i];
                al[i] = tmp;
            }
        }
        System.out.println("OUTPUT:");
        System.out.print("SORTED MATRIX : ");
        for (int index = 0; index < al.length; index++) {
            System.out.print(al[index] + " ");
        }
        System.out.println("\nFILLED MATRIX: ");
        fill();
    }

    void fill() {
        int a = 0;
        for (int i = 0; i < A.length; i++, a++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = val(a, al)[j];
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[] val(int i, int[] al) {
        int b = 0;
        int a[] = new int[al.length];
        for (int j = 0; j < al.length; j++) {
            if (j >= (al.length - i)) {
                a[j] = al[b];
                ++b;
            } else {
                a[j] = al[j];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        array_format obj16 = new array_format();
        obj16.input();
    }
}
