//Check if a number is even or odd without using % operator.
import java.util.Scanner;
public class EvenOrOdd {
  public static void main(String[]args) { 
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number: ");
  int number = input.nextInt();
  
    if(number / 2 * 2 == number){
      System.out.println("Even Number");
      
    }else{ 
      System.out.println("Odd Number");
  
  }
  }

}
