public class Main {

    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            System.out.println("100 at " + rate + "% interest = " + calculateInterest(100, rate));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
