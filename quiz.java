// ex:14
import java.util.*;
public class quiz {
int A[][];

void input() {
    Scanner in = new Scanner(System.in);
    System.out.println("INPUT :\n \t");
    System.out.println("Enter the order of the matrix : ");
    int m = in.nextInt();
    if (m > 3 && m < 11) {
        A = new int[m][m];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("OUTPUT : ");
    } else {
        System.out.println("INVALID! try again");
        input();
    }

}

    public static void main(String[] args) {
    }
}
