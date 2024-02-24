public class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;      // Converting minutes to hours
            long day = hour / 24;          // Converting hours to days
            long year = day / 365;         // Converting days to years
            long daysLeft = day % 365;     // After getting the Quotient, get the remainder of the days

            System.out.println(minutes + " min = " + year + " y and " + daysLeft + " d");
        }
    }
}