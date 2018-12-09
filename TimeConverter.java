// Program that converts times from 24 hour clock to 12 hour clock and vice versa
// Tumelo Lephadi
// 23 July 2015

import java.util.Scanner;
public class TimeConvertor{
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a time ([h]h:mm [am|pm]):");
      String time = input.nextLine();
   
      if (time.charAt(time.length()-1) == 'm'){
         if (time.charAt(time.length() - 2) == 'a'){
            if (time.length() == 7){
               System.out.println('0' + time.substring(0, time.length() - 2));
            }
            else if (time.substring(0, 2).equals("12")){
               System.out.println( "00" + time.substring(2, time.length() - 2)); 
            }
            else System.out.println(time.substring(0, time.length() - 2));
         }
         else if (time.length() == 7){
            System.out.print(Integer.parseInt(time.substring(0, 1)) + 12);
            System.out.println(time.substring(1, time.length() - 2));
         }
         else if (time.substring(0, 2).equals("12")){
            System.out.println(time.substring(0, time.length() - 2));
         }
         else{ 
            System.out.print(Integer.parseInt(time.substring(0, 2)) + 12);
            System.out.println(time.substring(2, time.length() - 2));
         }   
      }
      else if (time.substring(0, 2).equals("00")){
         System.out.print(12 + time.substring(2, time.length()) + " am");
      }
      else if (Integer.parseInt(time.substring(0, 2)) < 12){
         System.out.println(time.substring(1, time.length()) + " am");
      }
      else if (time.substring(0, 2).equals("12")){
         System.out.println(time + " pm");  
      }
      else{
         System.out.print(Integer.parseInt(time.substring(0, 2)) - 12);
         System.out.println(time.substring(2, time.length()) + " pm");
      }
   }
}    