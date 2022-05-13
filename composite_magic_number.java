// ex:2
// Composite Magic Numbers 
/*
  Aim: Develop a program to accept two positive integers m and n and display 
  the number of the Composite magic integers that are in the range between m 
  and n (Both Inclusive) and output them along with the frequency

  Algorithm:
  1.  start
  2.  Input m and n 
  3.  If(m<1 or n<1 or m>n) then print "INVALID INPUT" and goto step 20
  4.  count = 0
  5.  Set a loop i from m to n and repeat steps 6 to 19
  6.  Initialize isComposite as false
  7.  Set a loop j from 2 to i-1 and repeat steps 8 to 9
  8.  if(i%j == 0) then isComposite is true and break the loop
  9.  j+= 1;
  10. if(isComposite == true && i != 1) then num = i
  11. Repeat steps 12 to 17 till num >9
  12. Initialize sum = 0
  13. Repeat steps 14 to 16 till num != 0
  14. d = num%10
  15. num/=10
  16. sum+=d
  17. num = sum 
  18. if(num == 1) then count += 1 and print i
  19. Print count
  20. stop

*/

import java.util.*;

public class composite_magic_number {
  void input() {
    int m, n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of 'M'");
    m = in.nextInt();
    System.out.println("Enter the value of 'N'");
    n = in.nextInt();

    if (m < n) {
      process(m, n);
    }
  }

  void process(int m, int n) {
    boolean isCom = false;
    int count = 0, num = 0, sum = 0;
    for (int i = m; i <= n; i++) {
      isCom = false;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isCom = true;
          break;
        }
      }
      if (isCom && i!=1) {
        num = i;
        while (num > 9) {
          sum = 0;
          while (num != 0) {
            int d = num % 10;
            num /= 10;
            sum += d;
          }
          num = sum;
        }
        if (num == 1) {
          count++;
          System.out.print(i + "\t");
        }
      }
      
    }System.out.println("\n"+count);
  }

  public static void main(String[] args) {
    composite_magic_number obj2 = new composite_magic_number();
    obj2.input();
  }
}