package lab_projects;

import java.util.*;

class smallest_int {
    int m, n;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of M from 100 to 10000:\t");
        m = in.nextInt();
        System.out.println("Enter the value of N from 1 to 99");
        n = in.nextInt();
        if ((m >= 100 && m <= 10000) && (n > 1 && n < 99)) {
            process();
        } else {
            System.out.println("Invalid INPUT!");
        }
    }

    int sumDig(Long n) {
        int sum = 0, d;
        while (n > 0) {
            d = (int) (n % 10);
            sum += d;
            n /= 10;
        }
        return sum;
    }

    int countDig(Long n) {
        String s = Long.toString(n);
        int len = s.length();
        return len;
    }

    void process() {
        long i = (long) m;
        while (sumDig(i) != n) {
            i = i + 1;
        }
        System.out.println("The required number: " + i);
        System.out.println("The total number of digits :" + countDig(i));
    }

    public static void main(String args[]) {
        smallest_int obj = new smallest_int();
        obj.input();
    }
}