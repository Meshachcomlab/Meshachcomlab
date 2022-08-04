public class index {

    
    static void number(int m, int n) {
        boolean state = false;
        String sum = "";
        for (int i = m; i <= n; i++) {
            sum = "";
            for (int j = 1; j <= 3; j++) {
                sum += (i * j);
            
             state = check(sum);
             if(state){
                System.out.println(i+" ");
             }
        }
    }
    }
    static boolean check(String sum) {
        boolean state = false;
        int a[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < sum.length(); i++) {
            for (int j = 1; j <= 9; j++) {
                if (Integer.parseInt(String.valueOf(sum.charAt(i))) == j) {
                    a[j - 1] = (a[j - 1] + 1);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                state = true;
            } else {
                state = false;
            }
        }
        return state;
    }
    public static void main(String[] args) {
number(100,200);
System.out.println(check("273"));
    }
}
