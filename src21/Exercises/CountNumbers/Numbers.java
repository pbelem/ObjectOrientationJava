package CountNumbers;

public class Numbers {
    public static void OneUntilHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void PairNumbersUntilFifty() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void OddNumbersUntilFifty() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void primeNumbersUntilFifty() {
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}