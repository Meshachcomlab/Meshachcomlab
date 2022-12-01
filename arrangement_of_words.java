// ex:23
import java.util.*;

class arrangement_of_words {
    String str;
    String astr[];

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT:");
        str = in.nextLine();
        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?'
                || str.charAt(str.length() - 1) == '!')
            astr = str.split("[.?! ]");
        else {
            System.out.println("INVALID!");
            input();
        }
    }

    void process() {
        String swap = "";
        for (int i = 0; i < astr.length; i++) {
            for (int j = 1; j < astr.length - i; j++) {
                if (astr[j - 1].length() > astr[j].length()) {
                    swap = astr[j - 1];
                    astr[j - 1] = astr[j];
                    astr[j] = swap;
                } else if (astr[j - 1].length() == astr[j].length()) {
                    if (astr[j - 1].compareTo(astr[j]) > 0) {
                        swap = astr[j - 1];
                        astr[j - 1] = astr[j];
                        astr[j] = swap;
                    }
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < astr.length; i++) {
            System.out.print(astr[i] + " ");
        }
    }

    public static void main(String[] args) {
        arrangement_of_words obj23 = new arrangement_of_words();
        obj23.input();
        obj23.process();
        obj23.display();
    }
}