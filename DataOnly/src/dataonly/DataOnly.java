/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataonly;

/**
 *
 * @author Neele
 */
public class DataOnly {

    // Initialize public properties for DataOnly
    int i;
    float f;
    boolean b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create new DataOnly object
        DataOnly d = new DataOnly();
       
        // Assign values to i, f and b
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        
        // Prints out values as decimal, float and boolean
        System.out.printf("DataOnly output: %d, %f, %b ", d.i, d.f, d.b);
    }
    
}
