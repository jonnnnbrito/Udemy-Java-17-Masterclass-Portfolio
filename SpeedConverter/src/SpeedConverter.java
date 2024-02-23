public class SpeedConverter {
    // write code here
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            long rounded = Math.round(kilometersPerHour / 1.609);
            return rounded;
        } else {
            return -1;
        }
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}