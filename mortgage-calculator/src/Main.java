import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = readNumber("Annual Interest Rate: ", 1f, 30f);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    private static int readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;
    }

    private static float readNumber(String prompt, float min, float max) {
        Scanner scanner = new Scanner(System.in);
        float value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;
    }

    private static double calculateMortgage(int principal, float annualInterest, byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double numerator = monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments);
        double denominator = Math.pow(1 + monthlyInterest, numberOfPayments) - 1;

        return principal * (numerator / denominator);
    }
}
