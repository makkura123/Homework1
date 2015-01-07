/**
 * A program that prompts user for number range and prints out the prime numbers from 0 to this max
 * @author Neele
 */
package primenumbers;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        /**
         * Prompt user for max range (when program should stop)
         */
        System.out.println("At which number should the program stop? ");
        Scanner input = new Scanner(System.in);
        int primecount = input.nextInt();
        
        /**
         * Outer For-loop generates as many numbers as user asks for
         */
        for (int i = 1; i < primecount; i++) {
            /**
             * Inner For-loop tests which numbers are prime
             */
             for (int x = 1; x <= i ; x++){
                 if (i % x == 0 && i != x && x !=1) // if i is divisible by x but i and x are not the same, loop breaks
                    break;
                 
                 /**
                  * Important part: test if i is odd, i and x are the same and i % x is 0
                  * If so, the program prints the numbers
                  */   
                 if (i % 2 != 0 && i == x && i % x == 0) // 
                     {
                     System.out.printf("The Number %d is a prime number", i);
                     System.out.println();
                 }
            }
            
        }
        
    }
    
}
