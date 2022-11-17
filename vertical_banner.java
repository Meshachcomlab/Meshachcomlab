// ex:21
import java.util.*;

public class vertical_banner {

  int N;
  String str[];
  int l;

  void input() {
    Scanner in = new Scanner(System.in);
    System.out.print("N:");
    N = in.nextInt();
    str = new String[N];
    
    for (int i = 0; i < str.length; i++) {
        System.out.println("Team "+(/*buffer prob*/in.nextInt())+":");
        str[i] = in.next();
    }
  }

  void process() {
    l = str[0].length();
    for (int i = 1; i < str.length; i++) {
      if (l < str[i].length()) {
        l = str[i].length();
      }
    }
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < str.length; j++) {
        int len = str[j].length();
        if (len <= i) {
          System.out.print('\t');
        } else {
          System.out.print(str[j].charAt(i) + "\t");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    vertical_banner obj21 = new vertical_banner();
    System.out.println("INPUT:");
    obj21.input();
    obj21.process();
  }
}
