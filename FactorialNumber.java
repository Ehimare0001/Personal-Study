//Find the Factorial of any N numbers

import java.util.Scanner;
public class FactorialNumber{ 
  public static void main(String[]args){ 
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number: ");
  int N = input.nextInt();
  
  int factorial = 1;
  
  for(int i = 1; i <= N; i++) {
    factorial = factorial * i;
  }
   System.out.println("Factorial of " + N + " is " + factorial);
  }

}
