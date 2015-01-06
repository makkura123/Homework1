/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;
import java.util.*;
/**
 *
 * @author Neele
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 25; i++)
        {
            Random rand = new Random();
            int rand1 = rand.nextInt(100);
            int rand2 = rand.nextInt(100);
            
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
    
