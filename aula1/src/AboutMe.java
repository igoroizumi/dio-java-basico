import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Hello! What is your name?");
        String name = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();


        System.out.println("Your name is " + name);
        System.out.println("Your last name is " + lastName);
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + height);
    }
}
