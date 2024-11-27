/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salvador_activity3;
import java.util.Scanner;
/**
 *
 * @author Beboy
 */
public class Salvador_Activity3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("What is your number?");
        int number = scanner.nextInt();
         
         
        int factorial = 1;
      
        int i = 1;
        while (i <= number ){
            
            factorial = factorial*i;
            i++;
            
            
        }
        
        System.out.println("The factorial is: " + factorial);
      
        
        
             
        
            
            
            
            
            
            
            
            
            
        
    }
}
