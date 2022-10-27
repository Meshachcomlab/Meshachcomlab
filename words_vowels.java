
// ex:19
import java.util.*;

public class words_vowels {
    String sen = "";
    String sen_ar[];

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT:");
        sen = in.nextLine();
        if (sen.charAt(sen.length() - 1) == '.' || sen.charAt(sen.length() - 1) == '!'
                || sen.charAt(sen.length() - 1) == '?') {
            sen_ar = sen.split(" ");
        }
    }

    void process() {
        String vowels;
        char[] v = { 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < sen_ar.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (sen_ar[i].charAt(0) == v[j] && sen_ar[i].charAt(sen_ar[i].length()) == v[j]) {

                }
            }
        }
        for (String string : sen_ar) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        words_vowels obj19 = new words_vowels();
        obj19.input();
        obj19.process();

    }
}
