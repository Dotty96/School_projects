/*

   Part 1: Allows the user to input a x, y and radius of 2 circle. It then tells 
   the user if the second circle is in or over laps the first circle. 
  
   Part 2: Ask the user to input 3 sides of a triangle then tells the user if the
   triangle is equlatieral or not.

   Part 3: Has the user input a side and angle measurment and finds the area of
   the trinagle.

   Part 4: ask the user to input a valid ohio license and tells if it vaild or
   not if it is then it reapeats until a non valid lince is given.

   Psrt 5: Ask user to input a string and counts the number of vowels in that 
   string.
 */
package homework2;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author lamont
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
       System.out.println("Enter circle 1's x, y coordinates then enter the radius");
       double x1 = input.nextDouble(); 
       double y1 = input.nextDouble(); 
       double radius1 = input.nextDouble();
       
       System.out.println("Enter circle 2's x, y coordinates then enter the radius");
       double x2 = input.nextDouble(); 
       double y2 = input.nextDouble(); 
       double radius2 = input.nextDouble();
        
       double new_radius = radius1 - radius2;
       double new_radius2 = radius1 + radius2;
       double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1) );
        if(distance <= new_radius )
        {
            System.out.println("Circle 2 is inside of Circle 1");

        }
        else if(distance <= new_radius2 )
        {
            System.out.println("Circle 2 overlaps Circle 1");

        }
        else{
            System.out.println("Circle 2 does not overlaping Circle 1");
        }

/*********************************part2***************************************/        
        System.out.println("Enter 3 numbers for a triangle");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if(x == y)
            if(y == z )
                System.out.println("This is an equaliter triangle");
            else
                System.out.println("This is not an equaliter triangle");
        else
            System.out.println("This is not an equaliter triangle");
        
/*********************************part3***************************************/
     System.out.println("Enter the length and angle of a triangle to find the area");
   double side = input.nextDouble();
   double angle = input.nextDouble();
     
   double new_angle = Math.sin(angle);
     
   double Opp = new_angle * side;
   double area = Opp * side;
   System.out.println("The area of triangle with a side of " + side + " and a "
   + "angle of " + new_angle + " is " + area );
   
   input.nextLine(); // this gets rid of any left over int from previous problem
    
/*********************************part4***************************************/
   System.out.println("Enter a vaild Ohio license plate number ex. ABC 1234 ");
   String word;
   int word_letter = 0;
   int word_digit = 0;
   int valid = 1;
   while (valid == 1){
   word = input.nextLine();
   if (word.length() == 8 && word.charAt(3) == ' '){
    for(int i = 0; i < 3; i++){
     char c = word.charAt(i);
     if(Character.isLetter(c))
      {
        //System.out.println("this is a letter" + word.charAt(i));
          word_letter = word_letter + 1;
      }
     else{
         System.out.println(word + " Invalid");
         valid = 0;
         }
     
    }
    for(int j = 4; j < 8; j++){
       char c = word.charAt(j);  
       if(Character.isDigit(c))
        {
        //System.out.println("a digit " + word.charAt(j));
        word_digit = word_digit + 1;
        }
     else{
         System.out.println(word + " Invalid");
         valid = 0;
        }
     
     }
   
   }
   else{
       System.out.println("Wrong format");
       valid = 0;
   }
   if(word_letter == 3 && word_digit == 4){
       System.out.println(word + " Valid"); 
       System.out.println("Enter a vaild ohio licences plate number");
    }  
   word_letter = 0;
   word_digit = 0;
  

    }
   
   
/*********************************part5***************************************/ 
    System.out.println("Enter a string");
    String Word = input.nextLine().toLowerCase();
    int count = 0;
    for(int i = 0; i < Word.length(); i++){
        
    char vowel = Word.charAt(i);
        if(vowel == 'a' || vowel =='e' || vowel == 'i' || vowel == 'o'|| vowel == 'u' ){
            count = count + 1;
        }
            }
    System.out.println("The number of vowels in " + Word + " is " + count);
   
   
   
  
   }
}
