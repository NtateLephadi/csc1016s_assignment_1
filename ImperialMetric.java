// Program that converts feet to metres5
// Tumelo Lephadi
// 28 July 2015

import java.util.Scanner;
public class ImperialMetric{
   public static void main(String [] args){
   
      Scanner input = new Scanner(System.in);
      int inches = 0;   
      System.out.println("Enter the minimum number of feet (not less than 0):");
      int minimum = input.nextInt();
      System.out.println("Enter the maximum number of feet (not more than 30):");
      int maximum = input.nextInt();
      String ch = "|";
      System.out.printf("%4s", ch);
      
      for (inches = 0; inches <= 11; inches++){
         System.out.printf("%5d", inches);
         System.out.print("\"");
      }
      
      System.out.println();
           
      for (int feet = minimum; feet <= maximum; feet++){
         System.out.printf("%-3s", feet + "'");
         System.out.printf("|");
                 
         for (int j = 0; j <= 11; j++){
            double metres = (feet * 12 + j) * 0.0254;
            System.out.printf("%6.3f", metres);
            
         }
         System.out.println(); 
      }
   }  
}