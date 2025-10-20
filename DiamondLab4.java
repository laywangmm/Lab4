import java.util.Scanner;
/**
 * Write a description of class DiamondLab4 here.
 *
 * @author Layipaun Wang
 * @version v1.0
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