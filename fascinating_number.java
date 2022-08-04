
// ex:9
import java.util.*;

public class fascinating_number {
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT:\n\tm = ");
        int m = in.nextInt();
        System.out.print("\tn = ");
        int n = in.nextInt();
        if (m > 99 && n > 99 && m < 10000 && n < 10000) {
            System.out.println("OUTPUT: The fascinating numbers are: ");
            number(m, n);
        } else {
            System.out.println("INVALID! Try again");
            input();
        }
    }

    void number(int m, int n) {
        String sum = "";
        int count = 0;
        for (int i = m; i <= n; i++) {
            sum = "";
            for (int j = 1; j <= 3; j++) {
                sum += (i * j);
            }
            if (check(sum)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nFREGUENCY OF FASCINATING NUMBER IS: " + count);
    }

    boolean check(String sum) {
        boolean state = true;
        int a[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < sum.length(); i++) {
            for (int j = 1; j <= 9; j++) {
                if (Integer.parseInt(String.valueOf(sum.charAt(i))) == j) {
                    a[(j - 1)]++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1)
                state = false;
        }
        return state;
    }

    public static void main(String[] args) {
        fascinating_number obj9 = new fascinating_number();
        obj9.input();
    }
}
