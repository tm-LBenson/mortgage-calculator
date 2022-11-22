import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        int principal;
        while(true) {
            System.out.println("Choose principal between 1,000 and 1,000,000");
            System.out.printf("Principal ");
             principal = scanner.nextInt();
             if(principal >= 1000 && principal <= 1_000_000){
                 break;
             }else{
                 System.out.println("Invalid");
             }
        }
        float interest;
        while (true) {
            System.out.println("Choose interest rate between 1% and 30%");
            System.out.printf("Annual Interest Rate: ");

            interest = scanner.nextFloat();
            if(interest > 0 && interest <= 30){
                break;
            }else{
                System.out.println("invalid");
            }
        }
        byte period;
        while(true){
            System.out.println("Duration of loan between 1 and 30 years");
            System.out.printf("Period (years) ");
            period = scanner.nextByte();
            if(period > 1 && period <= 30){
                break;
            }else{
                System.out.println("invalid");
            }
        }

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double monthlyInterest = (interest /PERCENT)/MONTHS_IN_YEAR;
        double numberOfPayments = period * MONTHS_IN_YEAR;
        double numerator = monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments);
        double denominator = Math.pow((1 + monthlyInterest), numberOfPayments) - 1;
        double reducedFraction = principal*(numerator/denominator);
        String mortgageFormatted = formatter.format(reducedFraction);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}