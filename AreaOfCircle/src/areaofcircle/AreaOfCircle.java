/*
 * Calculate the area of a circle
 * @author Neele Ammon
 */
package areaofcircle;
import java.util.Scanner;

public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Prompts user for radius input
         */
        System.out.println("What is the radius of your circle? ");
        Scanner input = new Scanner(System.in);
        int radius = (int) input.nextFloat();
        
        /** 
         * Assign 3.14 as a float to variable PI
         */
        final float PI = 3.14f;
        
        /**
         * Calculates the area of the circle and prints the result
         */
        System.out.printf("The radius is %f", PI*radius*radius);
    }
    
}
