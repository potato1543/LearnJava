public class Main {

    public static void main(String[] args) {

        //Testing method
        boolean match;
        match = hasSameLastDigit(32,23,42);
        System.out.println(match);

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        //Variables
        int lastDigit1, lastDigit2, lastDigit3 = 0;

        if ((isValid(number1)) && (isValid(number2)) &&
                (isValid(number3))) {

            //rightmost digit (last digit of the number)
            lastDigit1 = number1 % 10;
            lastDigit2 = number2 % 10;
            lastDigit3 = number3 % 10;

            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) ||
                    (lastDigit2 == lastDigit3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }

}
