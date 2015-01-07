/**
 * A program that prints 2 random numbers and checks which one is greater
 * @author Neele
 */
package randomnumbers;
import java.util.*;

public class RandomNumbers {

   
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++)
        {
            /**
             * Generate 2 random numbers between 0 and 100
             */
            Random rand = new Random();
            int rand1 = rand.nextInt(100);
            int rand2 = rand.nextInt(100);
            
            /**
             * if-else statement to check which of the two nmbers is larger
             */
            if (rand1 >= rand2)
            {
                System.out.printf("Random1 '%d' is greater or equal to Random2 '%d'",rand1,rand2);
                System.out.println();
            }  
            else
            {
                System.out.printf("Random1 '%d' is smaller than Random2 '%d'",rand1,rand2);
                 System.out.println();
            }
        }
    }
}
    
