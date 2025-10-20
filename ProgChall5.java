import javax.swing.JOptionPane;
/**
 * @description using JOptionPane to promt a string, then counting how many times a character appears in a string. The it displays the results in a dialog box
 *
 * @author Layipaun Wang
 * @version v1.1
 * @since 10/12/25
 */
public class ProgChall5 {
    public static void main(String[] args) {
        String original = JOptionPane.showInputDialog("Enter the String:");
        String chStr = JOptionPane.showInputDialog("Enter a Character");
        chStr = chStr.trim();
        char test = chStr.charAt(0);
        
        int count = 0;
        for (int i = 0; i <= original.length() - 1; i++) {
            if (original.charAt(i) == test) {
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "In the String \"" + original+ "\", the character '" + test + "' occurs " + count + " time(s).");
    }
}