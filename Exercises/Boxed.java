public class Boxed {
    public static String repeat(String input, int hold) {
        //new int input = StdIn.readInt();
        String holder = "";

        for (int i = 0; i < hold; i++) {
            //System.out.print(input);
            holder = holder + input;
        }
        return (holder);
    }

    public static void boxedPrint(String sample) {

        int stars = sample.length();
        repeat("*", stars);
        System.out.println(repeat("*", sample.length() + 2));
        System.out.println("*" + sample + "*");
        System.out.println(repeat("*", sample.length() + 2));
    }

    //basic tests
    public static void main(String[] args) {
        StdOut.println(repeat("jar", 2));
        StdOut.println(repeat("he", 4));
        boxedPrint("Hello, World!");
    }
}
