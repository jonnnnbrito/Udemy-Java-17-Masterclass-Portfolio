public class Main {

    public static void main(String[] args) {
        int answer = sumDigits(32123);
        System.out.println(answer);
    }

    public static int sumDigits(int number){

        int digit = 0;
        int sumOfDigits = 0;

        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                digit = number % 10;
                sumOfDigits = sumOfDigits + digit;
                number = number / 10;
            }
        }
    return sumOfDigits;
    }

}
