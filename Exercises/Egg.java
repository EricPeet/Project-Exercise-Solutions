public class Egg {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // number of eggs
        System.out.print(n / 12); // number of filled 12-egg cartons
        System.out.print(" ");
        System.out.println(n % 12); // number of eggs left over
    }
}
