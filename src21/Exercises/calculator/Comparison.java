package calculator;

public class Comparison {

    public static double BiggerBetweenTwoNumbers(double number1, double number2) {
        return Math.max(number1, number2);
    }

    public static boolean compareEqualsAndShowsBigger(double number1, double number2) {
        if (number1 > number2) {
            System.out.println("The number " + number1 + " is greater than the " + number2);
        } else if (number1 == number2) {
            System.out.println("The number " + number1 + " is equal to " + number2);
        } else {
            System.out.println("The number " + number1 + " is less than the " + number2);
        }
        return number1 == number2;
    }


}
