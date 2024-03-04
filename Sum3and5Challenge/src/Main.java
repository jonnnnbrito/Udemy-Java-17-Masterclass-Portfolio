public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int sumNumbers = 0;

        for (int number = 1; number <= 1000; number++) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                counter += 1;
                sumNumbers += number;
                System.out.println(number);
            }

            if (counter == 5) {
                System.out.println("The total sum of 5 numbers = " + sumNumbers);
                break;
            }
        }
    }
}
