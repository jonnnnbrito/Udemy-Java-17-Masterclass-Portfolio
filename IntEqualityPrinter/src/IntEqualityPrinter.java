public class IntEqualityPrinter {
    // write code here
    public static void printEqual(int number1, int number2, int number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            System.out.println("Invalid Value");
        } else if (number1 == number2 && number2 == number3 && number1 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}