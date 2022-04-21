// ex:3
// Smallest Integer
/*
    Aim: Develop a program to accept 2 +ve numbers M and N Such that M is between  
     100 and 10000 and N is less than 100 and print the smallest required number 
     whose sum of all it's digits is equal to N. Also print the total number of digits
     present in the required number.
     
    Algorithm:
    1.  start
    2.  Input M and N
    3.  if(M<1000 or m>10000 or n<1 or n>99) then print "INVALID INPUT" and goto step 9
    4.  initialize i as m
    5.  Repeat step 6 till the method sumDig(i) != n
    6.  i+=1
    7.  Print the required number as i
    8.  Call the method to countDig(i)     
    9. stop

    sumDig(int n)
    1. sum = 0
    2. Repeat Steps 3 to 5 till n > 0
    3. d = n%10
    4. sum += d
    5. n/=10
    6. return Sum

    countDig(int n)
    1. Convert n to String s
    2. Find the length of s and assign to len
    return len
 */
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