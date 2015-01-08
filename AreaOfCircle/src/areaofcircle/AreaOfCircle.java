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
         //PT: As before, get in the habit of breaking things out into separate classes.
         //    This works, but as programs get bigger, this approach won't be maintainable
        System.out.println("What is the radius of your circle? ");
        Scanner input = new Scanner(System.in);
        int radius = (int) input.nextFloat();
        
        /** 
         * Assign 3.14 as a float to variable PI
         */
        final float PI = 3.14f;  //PT: Why not use java.lang.Math.PI?
        
        /**
         * Calculates the area of the circle and prints the result
         */
        System.out.printf("The radius is %f", PI*radius*radius);
    }
    
}
