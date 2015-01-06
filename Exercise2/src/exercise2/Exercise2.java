/**
 * Program that takes three arguments from the command line and prints them
 * @author Neele
 */
package exercise2;


public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Print out arguments using for loop
         */
        for (int i = 0; i < args.length && i < 3; i++){
            System.out.println(args[i]);
        }
    }
}
