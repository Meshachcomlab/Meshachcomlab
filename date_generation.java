
// ex:7
import java.util.*;

public class date_generation {
    int d[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String y[] = { "january", "february", "march", "april", "may", "june", "july", "august", "september", "october",
            "november", "december" };
    int date, month ;
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input:\nDay Number: ");
        int Dn = in.nextInt();
        System.out.print("Year: ");
        int Yn = in.nextInt();
        System.out.println("Date After(N days): ");
        int Nn = in.nextInt();
        if ((Dn >= 1 && Dn <= 366) && (Yn >= 1 && Yn <= 9999)) {
            if (Yn % 4 == 0)
                d[1] = 29;
            process(Dn, Yn);
        }
        if (1 <= Nn && Nn <= 100) {
            process((Dn+Nn), Yn);
        }
    }

    void process(int dn, int yn) {
        int sum = 0;
        
        String e[] = { "st", "nd", "rd" };
        if (dn <= 31) {

        } else {
            int a = dn;
            sum = a;
            for (int i = 0; i < d.length; i++) {
                sum -= d[i];
                if (sum <= d[i]) {
                    date = sum;
                    month = (i+1);
                    if (dn == 1 || dn == 2 || dn == 3) {
                        System.out.println(
                                "Date: " + sum + e[(sum - 1)].toUpperCase() + " " + y[i + 1].toUpperCase() + ", " + yn);
                    } else {
                        System.out.println("Date: " + sum + "TH " + y[i + 1].toUpperCase() + ", " + yn);
                    }
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        date_generation obj7 = new date_generation();
        obj7.input();
    }
}
