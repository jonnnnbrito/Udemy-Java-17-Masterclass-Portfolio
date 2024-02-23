public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
        if (isBarking) {
            if (hourOfDay >= 0 || hourOfDay == 23) {
                if (hourOfDay < 8 || hourOfDay == 23) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}