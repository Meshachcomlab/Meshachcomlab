// ex:6
import java.util.*;

public class goldbatch_number {

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int N = in.nextInt();
        if (N > 9 && N < 50 && N % 2 == 0) {
            process(N);
        } else{
            System.out.println("Invalid Input!");
            input();
        }
            
    }

    boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
            if(count == 2){
                break;
            }
        }
        return (count == 2);
    }

    void process(int n) {
        System.out.println("The prime pairs are:");
        int a = 3, b = 0;
        while (a <= n / 2) {
            b = n - a;
            if (isPrime(a) && isPrime(b)) {
              System.out.println(a +" , "+b);
            }
            a += 2;
        }
    }

    public static void main(String[] args) {
        goldbatch_number obj6 = new goldbatch_number();
        obj6.input();
    }
}
