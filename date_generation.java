
// ex:7
import java.util.*;

public class date_generation {
    int d[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String y[] = {"january","february","march","april","may","june","july","august","september","october","november","december"}

    void input() {
        Scanner in = new Scanner(System.in);
        int Dn = in.nextInt();
        int Yn = in.nextInt();
        if ((Dn >= 1 && Dn <= 366) && (Yn >= 1 && Yn <= 9999)) {
            process(Dn, Yn);
        }
    }

    void process(int dn, int yn) {
        int sum = 0;
        if (yn % 4 == 0)
            d[1] = 29;
            String e [] = {"st","nd","rd"};
            if(dn!= 11 || dn!= 12 || dn!= 13){
                if()
            }
            if(dn<d[1]){
                System.out.println("DATE: "+dn+"th");
            }
        for (int i = 0; i < d.length; i++) {
            if(dn>d[i]){
                sum += d[i];
            }
        }
    }

    public static void main(String[] args) {
        date_generation obj7 = new date_generation();
        obj7.input();
    }
}
