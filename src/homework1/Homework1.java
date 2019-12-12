/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.util.Scanner;
/**
 *
 * 
 */
/*This program allows user to input a score if its greater than 80 then they \
pass if lower than 80 they fail*/
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your current grade.");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score > 80)
        {
          System.out.println("PASS!");  
        }
        else
        {
          System.out.println("FAIL!");  
        }
        
        
    }
    
}
