public class AgeChecker {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age >= 18) {
            System.out.println("You can vote");
        } else if (age < 18 && age >= 0) {
            System.out.println("Too young to vote");
        } else if (age < 0) {
            System.out.println("You are a time traveller");
        }
    }
}
