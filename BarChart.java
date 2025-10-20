import java.util.Random;
/**
 * This program generates 3 random numbers betweek 0 and 999 and prints eahc number on a bar char
 * For every 100 in a number it prints one *.
 * If number is less than 100 it prints <100 no stars.
 *
 * @author Layipaun Wang
 * @version v1.1
 */
public class BarChart
{
    public static void main(String[] args) {
        int first, second, third;Random generator = new Random();
        
        first = generator.nextInt(1000);
       second = generator.nextInt(1000);
        third = generator.nextInt(1000);
        
        System.out.println("Number 1 is: " + first);
        System.out.println("Number 2 is: " + second);
        System.out.println("Number 3 is: " + third);
        System.out.println();
        
        System.out.println("NUMBER BAR CHART");
        
        System.out.print("Number 1: ");
        if (first < 100) { 
            System.out.println("<100 no stars");
        } else { 
            for (int i = 0; i < first / 100; i++) {
                System.out.println("*");
            }
            System.out.println();
        }
        
        System.out.print("Number 2: ");
        if (second < 100) {
            System.out.println("<100 no stars");
        } else {
            for (int i = 0; i < second / 100; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.print("Number 3: ");
        if (third < 100) {
            System.out.println("<100 no stars");
        } else {
            for (int i = 0; i < third / 100; i++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
        }