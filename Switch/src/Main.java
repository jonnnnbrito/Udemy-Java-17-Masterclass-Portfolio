public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 nor 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" ->  "1st Quarter";
            case "APRIL", "MAY", "JUNE" -> "2nd Quarter";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd Quarter";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th Quarter";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}