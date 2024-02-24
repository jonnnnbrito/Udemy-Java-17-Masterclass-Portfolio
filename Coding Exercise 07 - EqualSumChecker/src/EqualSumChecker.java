public class EqualSumChecker {
    // write code here
    public static boolean hasEqualSum (int number1, int number2, int number3) {
        int sumNumber = number1 + number2;

        if (number3 == sumNumber) {
            return true;
        } else {
            return false;
        }
    }
}