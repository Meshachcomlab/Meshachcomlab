package lab_projects;

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
    composite_magic_number ob = new composite_magic_number();
    ob.input();
  }
}