
// ex:20
import java.util.*;

public class caesar_cipher {
    String str = "";
    String nstr = "";

    void input() {
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        if (str.length() > 3 && str.length() < 100) {
            proces();
        }
    }

    void proces() {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if(str.charAt(i) < 'n'||str.charAt(i)<'N')
                nstr+=(char) (str.charAt(i)+13);
                else{
                    nstr+=(char) (str.charAt(i)-13);
                }
            }
            else{
                nstr+=str.charAt(i);
            }
        }
        System.out.println(nstr);
    }

    public static void main(String[] args) {
        caesar_cipher obj20 = new caesar_cipher();
        System.out.println("INPUT:");
        obj20.input();
    }
}
