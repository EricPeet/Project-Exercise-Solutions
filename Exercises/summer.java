
public class summer {

    public static double sum(double[] a) {
        double ret = 0;
        for (int i = 0; i < a.length; i++) {
            ret = ret + a[i];

        }
        return ret;
    }

    public static double sum(int[] a) {
        int out = 0;
        for (int i = 0; i < a.length; i++) {
            out = out + a[i];


        }
        return out;
    }

    // basic tests
    public static void main(String[] args) {
        StdOut.println(sum(new int[] { 1, 2, 6 }));
        StdOut.println(sum(new double[] { Math.PI, Math.E, Math.log(2) }));
    }
}
