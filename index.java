class index {
    static String sent = "This is The Sentence";

    static int f = 0;

    static boolean isCap(String w) {
        if (Character.isUpperCase(w.charAt(0)))
            return true;
        return false;
    }

    public static void main(String[] args) {
        sent = sent.trim();
        sent += " ";
        String s = "";
        int b = 0;
        for (int i = 0; i < sent.length(); i++) {
            if (Character.isWhitespace(sent.charAt(i))) {
                s = sent.substring(b, i).trim();
                b = i;
                System.out.println(s);
                if(isCap(s))
                f++;
            }
        }
        System.out.println("The number of the words with caps :"+f);
    }
}