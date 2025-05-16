import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Enter your  Agency: ");
        String agency = scanner.next();

        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();

        System.out.println("Hello " + name + ", your account number is " + accountNumber + " and your agency is " + agency + ". Your balance is " + balance + " is now available for withdrawal.");
        
    }
    
}
