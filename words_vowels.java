
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
            sen_ar = sen.split("[.?! ]+");
        } else {
            System.out.println("INVALID INPUT!");
            input();
        }
    }

    void process() {
        int count = 0;
        String vowels = "", nvowels = "";
        char[] v = { 'A', 'E', 'I', 'O', 'U' };
        boolean state = true;
        for (int i = 0; i < sen_ar.length; i++) {
            state = true;
            for (int j = 0; j < v.length; j++) {
                if (sen_ar[i].charAt(0) == v[j]) {
                    for (int k = 4; k >= 0; k--) {
                        if (sen_ar[i].charAt(sen_ar[i].length() - 1) == v[k]) {
                            vowels += sen_ar[i] + " ";
                            count++;
                            state = false;
                        }
                    }
                }
                if (state) {
                    nvowels += sen_ar[i] + " ";
                    break;
                }
            }
        }
        System.out.println(vowels + nvowels);
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + count);
    }

    public static void main(String[] args) {
        words_vowels obj19 = new words_vowels();
        obj19.input();
        System.out.println("OUTPUT:");
        obj19.process();
    }
}
