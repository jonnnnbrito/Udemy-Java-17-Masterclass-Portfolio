public class Main {

    public static void main(String[] args) {
        isEvenNumber(5);
        isEvenNumber(6);
        isEvenNumber(7);
        isEvenNumber(8);
        isEvenNumber(9);
        isEvenNumber(10);
    }

    public static boolean isEvenNumber(int number) {
        int i = 4;

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);          // Even Number
                return true;
            } else {
                return false;                   // Odd Number
            }
            i++;
        }
    }
}