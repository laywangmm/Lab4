import java.util.Scanner;
/**
 * Asks for an odd integer width and prints out a diamond out of "*".
 * If it is an even number the program adds 1 to make it odd before printing the diamond shape
 *
 * @author Layipaun Wang
 * @version v1.1
 */
public class DiamondLab4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the width of the diamond: ");
        int width = input.nextInt();
        
        if (width % 2 == 0) {
            width++;
        }
        int spaces, stars;
        
        // Top of Diamond
        
        for (int line = 1; line <= (width / 2) +1; line++) {
            for(spaces = line; spaces <= width / 2; spaces++) {
                System.out.print("_");
            }
            for (stars = 1; stars <= (2* line) - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower Diamond
        
        for (int line = (width / 2); line >= 1; line--) {
            for (spaces = width / 2; spaces >= line; spaces--) {
                System.out.print("_");
            }
            for (stars = 1; stars <= (2 * line) - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}