
// ex:8
import java.util.*;

public class prime_adam_integer {

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT: \nm = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        process(m, n);
    }

    int reverse(int a) {
        int re = 0;
        while (a != 0) {
            int r = a % 10;
            re = re * 10 + r;
            a = a / 10;
        }
        return re;
    }

    boolean isPrime(int n) {
        boolean prime = false;
        int f = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                f++;
            }
        }
        if (f == 2) {
            prime = true;
        }
        return prime;
    }

    boolean isPrime_Adam(int n) {
        int a = 0, ra = 0, rb = 0, b = 0;
        boolean isPrime_adam = false;

        a = reverse(n);
        b = n * n;
        ra = a * a;
        rb = reverse(ra);
        if (b == rb) {
            isPrime_adam = true;
        }
        return isPrime_adam;
    }

    void process(int M, int N) {
        int c = 0;
        for (int i = M; i <= N; i++) {
            if (isPrime(i) && isPrime_Adam(i)) {
                c++;
                System.out.print(i + " ");
            }
        }
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS : " + c);

    }

    public static void main(String[] args) {
        prime_adam_integer obj8 = new prime_adam_integer();
        obj8.input();
    }
}
