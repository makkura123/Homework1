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

    int i;
    float f;
    boolean b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataOnly d = new DataOnly();
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        
        System.out.printf("DataOnly output: %d, %f, %b ", d.i, d.f, d.b);
    }
    
}
