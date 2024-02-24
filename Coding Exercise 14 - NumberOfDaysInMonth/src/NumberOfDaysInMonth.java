public class NumberOfDaysInMonth {
    // write code here

    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        boolean isLeapYearCheck = isLeapYear(year);

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYearCheck ? 29 : 28;
            default:
                return -1;
        }
    }
}