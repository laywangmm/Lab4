import java.util. Scanner;
/**
 * @author Layipaun Wang
 * @version v1.1
 * @since 10/13/25
 */
public class ReverseWord
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;
        do { 
            System.out.print("Enter words separated by a space ending with the word quit: ");
            String origWord = keyboard.next();
            while (!(origWord.equalsIgnoreCase("quit"))) {
                char firstChar = origWord.charAt(0);
                String partial = origWord.substring(1);
                String flipped = partial + firstChar;
                String reverseWord = "";
                for (int i = flipped.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + flipped.charAt(i);
                }
                if(origWord.equals(reverseWord)) {
                    System.out.println(origWord + " works");
                } else {
                    System.out.println(origWord + " does not work");
                }
                origWord = keyboard.next();
                }
                System.out.print("Enter yes to process another line otherwise no.");
                keyboard.nextLine();
                again = keyboard.next();
                System.out.println();
            }
            while (again.equalsIgnoreCase("yes"));
            keyboard.close();
    }
}