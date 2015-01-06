/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofcircle;
import java.util.Scanner;

/**
 *
 * @author Neele
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int radius = (int) input.nextFloat();
        final float PI = 3.14f;
        
        System.out.printf("The radius is %f", PI*radius*radius);
    }
    
}
