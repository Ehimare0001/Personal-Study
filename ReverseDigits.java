//Write a Java program that reads a number and prints its digit reversed.

import java.util.Scanner;
public class ReverseDigits{
  public static void main(String[]args) {
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
    int number = input.nextInt();
    
    while(number > 0) { 
    
    int digit = number % 10;
    System.out.print(digit);
    number = number / 10;
    
    }
  
  
  }


}






  
  

