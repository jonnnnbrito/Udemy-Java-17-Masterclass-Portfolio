public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        long firstNumber = (long) (number1 * 1000);
        long secondNumber = (long) (number2 * 1000);

        if (firstNumber == secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}