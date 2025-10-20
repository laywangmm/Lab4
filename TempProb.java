import java.util.Scanner;
/**
 * Description
 * 
 * @author Layipaun Wang
 * @version v1.0
 * @since 10/12/25
 */
public class TempProb {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter a whole number, a space, and C or F: ");
            double temp = keyboard.nextDouble();
            char unit = keyboard.next().toUpperCase().charAt(0);

            while (!(unit == 'F' || unit == 'C')) {
                System.out.print("\nEnter C to convert to F or F to C: ");
                unit = keyboard.next().toUpperCase().charAt(0);
            }

            double converted;
            if (unit == 'F') {
                converted = (temp - 32) * (5.0 / 9.0);
                System.out.printf("%.0fF converted is: %.1fC%n%n", temp, converted);
            } else {
                converted = (temp * (9.0 / 5.0)) + 32;
                System.out.printf("%.0fC converted is: %.1fF%n%n", temp, converted);
            }

            System.out.print("Do you want to calculate another temp? ENTER YES OR NO: ");
            again = keyboard.next();
            System.out.println();

        } while (again.equalsIgnoreCase("yes"));

        keyboard.close();
    }
}
