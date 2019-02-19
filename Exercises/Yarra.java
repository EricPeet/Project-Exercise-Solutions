public class Yarra {
    public static String[] reverse1(String[] straight) {
        int n = straight.length;
        String[] rev = new String[n];
        for (int i = 0; i < n; i++)
            rev[i] = straight[n - i - 1];

        return rev;
    }

    public static void reverse2(String[] straight2) {
        int n = straight2.length;
        for (int i = 0; i < n / 2; i++) {
            String rev2 = straight2[i];
            straight2[i] = straight2[n - i - 1];
            straight2[n - i - 1] = rev2;
        }

    }

    // basic tests
    public static void main(String[] args) {
        String[] test = {"this", "is", "a", "test"};
        String[] tset = reverse1(test);
        StdOut.println("after calling reverse1, test is: "
                + java.util.Arrays.toString(test));
        StdOut.println("after calling reverse1, tset is: "
                + java.util.Arrays.toString(tset));
        String[] second = {"another", "test", "for", "you", "here"};
        reverse2(second);
        StdOut.println("after calling reverse2, second is: "
                + java.util.Arrays.toString(second));
    }
}
