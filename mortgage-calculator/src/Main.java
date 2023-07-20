import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Principal ");
        int principal =   Integer.parseInt(scanner.nextLine().trim());
        System.out.printf("Annual Interest Rate: ");
        double interest = Double.parseDouble(scanner.nextLine().trim());
        System.out.printf("Period (years) ");
        byte period = Byte.parseByte(scanner.nextLine().trim());
        NumberFormat total = NumberFormat.getCurrencyInstance();
        double monthlyInterest = (interest /100)/12;
        double numberOfPayments = period * 12;
        double top = monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments);
        double bottom = Math.pow((1 + monthlyInterest), numberOfPayments) - 1;
        double reducedFraction = principal*(top/bottom);
        System.out.println("Mortgage: "+total.format(reducedFraction));

    }
}