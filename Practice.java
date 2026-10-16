
//2.14. Write an application that displays the number 1 to 4 on the same line, with each pair of adjacent numbers separated by one space.
//a. One System.out.println statement
//public class Practice{

//	public static void main(String[]args){
	
	//System.out.println("1 2 3 4");
	
	
	//b. Four System.out.println
	
	//System.out.println("1");
	//System.out.println("2");
	//System.out.println("3");
	//System.out.println("4");
	
	//c. One printf
	
	//System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
	
	//	}
	
//}


//2.15 Write an application that asks the user to enter two integers, obtains them from the user and prints: 
	//a. the square of each,  b. the sum of their square.   
	//c. the difference of the squares(first number squared minus second number squared)
	
	
import java.util.Scanner;
public class IntegerSquare{
  public static void main(String[]args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter first integer: ");
  int firstNumber = input.nextInt();
  
  System.out.print("Enter second integer: ");
  int secondNumber = input.nextInt();
  
  int firstSquare = firstNumber * firstNumber;
  
  int secondSquare = secondNumber * secondNumber;
  
  int sum = firstSquare + secondSquare;
  
  int difference = firstSquare - secondSquare;
  
  
  System.out.printf("Square of the first number: %d%n", firstSquare);
  System.out.printf("Square of the second number: %d%n", secondSquare);
  System.out.printf("Sum of their square: %d%n", sum);
  System.out.printf("Difference of their square: %d%n:", difference);
  
  
  
  }

}
	
