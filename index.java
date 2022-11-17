class index {
static int a[] = {1,6,3,8,9};
    public static void main(String[] args) {
        int swap = 0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i] > a[i+1]){
              a[i] = swap;
              a[i] = a[i+1];
              a[i+1] = swap;
            }
        }
        for (int string : a) {
            System.out.println(string);
        }
    }
}