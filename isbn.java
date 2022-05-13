// ex:1
// isbn
/*
Aim:Develop a program to accept a ten-digit code and check whether it's a valid isbn code

 Algorithm:
  1.  start
  2.  Input m and n 
  3.  If(m<1 or n<1 or m>n) then print "INVALID INPUT" and goto step 20
  4.  count = 0
  5.  Initialize a,sum and i as 0 and k as 10
  6.  Set a loop i from m to n and repeat steps 7 to 10
  7.  Seperate i^th character of s and assign to ch
  8.  if(ch=="x") then a =10 else a = integer value of ch
  9.  sum = sum + a*k;
  10. k-=1
  11. Print sum
  12. if(sum%11 == 0 ) then print "Leaves No Remainder - Valid ISBN CODE";
      else Print "Leaves Remainder -INVALID ISBN CODE"
  13. Stop
*/

import java.util.*;

public class isbn {
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the isbn code");
        String s = in.nextLine();
        int l = s.length();
        if (l != 10) {
            System.out.println("Invalid input");
        } else {
            process(s);
        }
    }

    void process(String s) {
        String ch;
        int a = 0, sum = 0, k = 10, l = s.length();
        for (int i = 0; i < l; i++) {
            ch = Character.toString(s.charAt(i));
            if (ch.equalsIgnoreCase("X")) {
                a = 10;
            } else {
                a = Integer.parseInt(ch);
                sum = sum + a * k;
                k--;
            }
           
        }
        System.out.println("OUTPUT: Sum =" + sum);
        if (sum % 11 == 0) {
            System.out.println("Leaves No Remainder -VALID ISBN CODE");
        } else {
            System.out.println("Leaves Remainder -INVALID ISBN CODE");
        }
    }

    public static void main(String[] args) {
        isbn obj1 = new isbn();
        obj1.input();
    }
}