// Program that determines if a number is a perfect square and a palindrome
// Tumelo Lephadi
// 28 July 2015

import java.util.Scanner;
public class PalinPerfect{
   public static void main(String [] args){
   
      Scanner input1 = new Scanner(System.in);
      System.out.println("Enter the starting point N:");
      int N = input1.nextInt();
      System.out.println("Enter the ending point M:");
      int M = input1.nextInt();
      System.out.println("The palindromic perfect squares are as follows:");
      
      if (M > N){
         for (int i = N; i <= M; i++){
            String iReverse = Integer.toString(i) ;
            String reverse = new StringBuffer(iReverse).reverse().toString() ;
            if (iReverse.equals(reverse)){
               if (Math.sqrt(i) % 1 == 0){
                  if (i != 0){
                     System.out.println(i);
                  
                  }
               }
            }
         }     
      }
   }
}