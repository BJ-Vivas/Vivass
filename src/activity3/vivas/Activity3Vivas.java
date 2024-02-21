/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3.vivas;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Activity3Vivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       Scanner scn = new Scanner(System.in);
       
        double celcius;
        
        System.out.println("Enter Celcius: ");
        
        celcius = scn.nextDouble();
        
        double fahrenheit = (celcius * 9/5) + 32;
    
        System.out.println("Result:" + fahrenheit);
                
    }
    
}
