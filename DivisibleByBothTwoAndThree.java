//Check if a number is divisible by both 2 and 3

import java.util.Scanner;
public class DivisibleByBothTwoAndThree { 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number: ");
  
  int number = input.nextInt();
  
    if(number % 2 == 0 && number % 3 == 0){
      System.out.println("It is Divisible by both 2 and 3");
    
    }else{ 
      System.out.println("It is not Divisible by both 2 and 3");
    
    
    }
  
  
  
  }

}
