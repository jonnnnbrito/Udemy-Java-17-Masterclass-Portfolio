public class SumOddRange {
    // write code here

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }


    public static int sumOdd(int start, int end) {

        int sumOddNumbers = 0;

        if (start < 0 || end < 0 || end < start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOddNumbers += i;
            }
        }

        return sumOddNumbers;
    }
}