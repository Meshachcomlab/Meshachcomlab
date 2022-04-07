package lab_projects;

import java.util.*;

public class isbn {
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the isbn code");
        String s = in.nextLine();
        int l = s.length();
        System.out.println("Invalid code");
        if (l != 10) {
            System.out.println("Invalid input");
        } else {
            process(s);
        }
    }

    void process(String s) {
        String ch;
        int a = 0, sum = 0, k = 10, l = s.length();
        for (int i = 0; i < l; i++) {
           ch = Character.toString(s.charAt(i));
           if(ch.equalsIgnoreCase("X")){
               a = 10;
           }
           else{
               
           }
        }
    }

    public static void main(String[] args) {

    }
}