public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen (int number1, int number2, int number3) {
        if (isTeen(number1) || isTeen(number2) || isTeen(number3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int number) {
        if (number >= 13 && number <= 19) {
            return true;
        } else {
            return false;
        }
    }
}