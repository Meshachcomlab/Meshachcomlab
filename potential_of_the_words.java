// ex:25
import java.util.*;

public class potential_of_the_words {

  String str[];
  String istr;
  int ln[];

  void input() {
    Scanner in = new Scanner(System.in);
    System.out.print("INPUT :");
    istr = in.nextLine();
    str = istr.split("[.?! ]");
    if (str.length == 0) {
      System.out.println("INVALID!");
      input();
    }
    ln = new int[str.length];
  }

  void process() {
    for (int i = 0; i < str.length; i++) {
      ln[i] = 0;
      for (int j = 0; j < str[i].length(); j++) {
        ln[i] += (int) str[i].charAt(j);
      }
      System.out.println(str[i] + " = " + ln[i]);
    }
    int swap = 0;
    String Swap = "";
    for (int i = 0; i < ln.length; i++) {
      for (int j = 1; j < ln.length - i; j++) {
        if (ln[j - 1] > ln[j]) {
          swap = ln[j - 1];
          Swap = str[j - 1];
          ln[j - 1] = ln[j];
          str[j - 1] = str[j];
          ln[j] = swap;
          str[j] = Swap;
        }
      }
    }
  }

  void display() {
    for (int i = 0; i < str.length; i++) {
      System.out.print(str[i] + " ");
    }
  }

  public static void main(String[] args) {
    potential_of_the_words obj25 = new potential_of_the_words();
    obj25.input();
    obj25.process();
    System.out.println("\nOUTPUT:");
    obj25.display();
  }
}
