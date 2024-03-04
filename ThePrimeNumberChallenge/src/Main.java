public class Main {
    public static void main(String[] args) {
        int primeNumberCounterVariable = 0;

        for (int number = 10; number <= 50; number++) {
            if (isPrime(number) == true) {
                System.out.println(number);
                primeNumberCounterVariable += 1;
                if (primeNumberCounterVariable == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
