
// ex:18
import java.util.*;

public class fill_the_matrix {
    char[][] A;
    char ch[] = new char[3];

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :\n \t");
        System.out.print("Enter the order of the matrix : \nM = ");
        int m = in.nextInt();
        System.out.print("N = ");
        int n = in.nextInt();
        if (m > 3 && m < 10 && n > 3 && n < 10) {
            A = new char[m][n];
            for (int i = 0; i < ch.length; i++) {
                System.out.println((i + 1) + "th CHARACTER:");
                ch[i] = (in.next()).charAt(0);
            }
        } else {
            System.out.println("INVALID! try again");
            input();
        }
    }

    void matrix() {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if ((i == 0 || j == 0) && (i == A[i].length - 1 || j == A[i].length - 1)&&(i==j)) {
                    A[i][j] = ch[0];
                } else if (i % 2 == 0 || j == 0 || j == A[i].length - 1) {
                    A[i][j] = ch[1];
                } else {
                    A[i][j] = ch[2];
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fill_the_matrix obj18 = new fill_the_matrix();
        obj18.input();
        obj18.matrix();
        obj18.display();
    }
}
