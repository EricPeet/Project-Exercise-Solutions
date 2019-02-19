
public class SquareCensus {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1;
        int sum = 0;
        while (i * i <= n) {
            System.out.println(i * i);
            sum = sum + i * i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
