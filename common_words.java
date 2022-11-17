// ex:24
import java.util.*;

public class common_words {

  String str[]; //To store the splited array.
  String str1[];
  String istr; //To store the input from user.
  String fstr[]; //To store the repeating words.
  int fint[]; //To store the frequency of the repeating words.

  void input() {
    Scanner in = new Scanner(System.in);
    System.out.print("INPUT:\t");
    istr = in.nextLine();
    str = (istr).split("[.?!]");
    int a = ((str[0].length() < str[1].length()) ? 0 : 1);
    str1 = str[a].split("[.?! ]");
    if (str.length == 2) {
      str = istr.split("[.?! ]");
    } else {
      System.out.println("INVALID!");
      input();
    }
    fstr = new String[str1.length];
    fint = new int[str1.length];
  }

  void process() {
    for (int i = 0; i < str1.length; i++) {
      fint[i] = 0;
      fstr[i] = "";
      for (int j = 0; j < str.length; j++) {
        if (str[i].equals(str[j])) {
          fstr[i] = str[i];
          fint[i]++;
        }
      }
    }
  }

  void display() {
    for (int i = 0; i < istr.length(); i++) {
      if (Character.isLetter(istr.charAt(i))) {
        if (
          istr.charAt(i) == '.' ||
          istr.charAt(i) == '?' ||
          istr.charAt(i) == '!'
        ) {
          System.out.println();
        }
      }
      System.out.print(istr.charAt(i));
    }
    System.out.println("\n\nCOMMON WORDS \t\t FREQUENCY\n");
    int n = 0;
    for (int i = 0; i < fint.length; i++) {
      if (fint[i] > 1) {
        System.out.println(fstr[i] + "\t\t\t" + fint[i]);
        n++;
      }
    }
    if(n == 0)
    System.out.println("\tNO COMMON WORDS");
  }

  public static void main(String[] args) {
    common_words obj24 = new common_words();
    obj24.input();
    obj24.process();
    obj24.display();
  }
}
